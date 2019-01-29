# Verifier

This verifier checks if LTL formula is wrong on the provided
automaton.

## Usage

```
java -jar verifier.jar <file with ltl (several formulas are accepted)> <file with automaton schema> <output file>
```

You need compiled binary of ltl2ba in order to run this.
You should put it in the same directory as ***verifier.jar***,
which is located in the root folder for your convenience.
Compiled binaries you can find under
***src/main/resources/ltl2ba***.

Some examples of ltl formulas are provided for different
automatons. You can find them under 
***src/main/resources/ltl***. Output for these results is located
under ***src/main/resources/output***. 

## Automaton format

Automaton is specified in xml format. Please,
[see](https://docs.google.com/document/d/1nUaRnyy4cL5SgwDCfFBZLZiXETVISTsDWTk6-gUnEsk/edit) for more information.

### High-level approach

1) Take a LTL formula and construct Büchi automaton (ltl2ba library is used for it) by its negation:
```
'S(state0)'
FSMAutomaton(initialState=0, nodes=[0, 1], accepting=[0, 1], transitions={0={!S(state0)=[1]}, 1={true=[1]}})
```

2) Build automaton from the diagram in XML format:
```
Diagram(name=AChart, data=Data(fsm=FSM(event=[Event(name=id, comment=We see the word "id"), Event(name=number, comment=), Event(name=name, comment=We see the word "name"), Event(name=quote, comment=We see quotation symbol)], autoReject=false)), widget=[Widget(id=0, type=State, attributes=Attributes(name=state0, type=1, code=null, guard=null, action=null, event=null, incoming=[Incoming(id=4), Incoming(id=13)], nested=null, outgoing=[Outgoing(id=3), Outgoing(id=5)])), Widget(id=4, type=Transition, attributes=Attributes(name=null, type=null, code=null, guard=, action=[Action(name=SetID, comment=)], event=Event(name=number, comment=), incoming=null, nested=null, outgoing=null)), Widget(id=13, type=Transition, attributes=Attributes(name=null, type=null, code=null, guard=, action=[Action(name=SetName, comment=)], event=Event(name=quote, comment=We see quotation symbol), incoming=null, nested=null, outgoing=null)), Widget(id=3, type=Transition, attributes=Attributes(name=null, type=null, code=null, guard=, action=null, event=Event(name=id, comment=We see the word "id"), incoming=null, nested=null, outgoing=null)), Widget(id=5, type=Transition, attributes=Attributes(name=null, type=null, code=null, guard=, action=null, event=Event(name=name, comment=We see the word "name"), incoming=null, nested=null, outgoing=null)), Widget(id=1, type=State, attributes=Attributes(name=ID, type=0, code=null, guard=null, action=null, event=null, incoming=[Incoming(id=3)], nested=null, outgoing=[Outgoing(id=4)])), Widget(id=2, type=State, attributes=Attributes(name=SName, type=0, code=null, guard=null, action=null, event=null, incoming=[Incoming(id=5)], nested=null, outgoing=[Outgoing(id=8)])), Widget(id=8, type=Transition, attributes=Attributes(name=null, type=null, code=null, guard=, action=null, event=Event(name=quote, comment=We see quotation symbol), incoming=null, nested=null, outgoing=null)), Widget(id=7, type=State, attributes=Attributes(name=SText, type=0, code=null, guard=null, action=null, event=null, incoming=[Incoming(id=8), Incoming(id=12)], nested=null, outgoing=[Outgoing(id=12), Outgoing(id=13)])), Widget(id=12, type=Transition, attributes=Attributes(name=null, type=null, code=null, guard=, action=[Action(name=AddToken, comment=)], event=Event(name=*, comment=No event), incoming=null, nested=null, outgoing=null))])
FSMAutomaton(initialState=100000, nodes=[100000, 0, 100001, 1, 100002, 2, 100003, 100004, 100005, 7, 100006, 100007, 100008, 100009], accepting=[100000, 0, 100001, 1, 100002, 2, 100003, 100004, 100005, 7, 100006, 100007, 100008, 100009], transitions={100000={S(state0)=[0]}, 0={E(id)=[100001], E(name)=[100002]}, 100001={S(ID)=[1]}, 100002={S(SName)=[2]}, 1={E(number)=[100003]}, 100003={A(SetID)=[100004]}, 100004={S(state0)=[0]}, 2={E(quote)=[100005]}, 100005={S(SText)=[7]}, 7={E(*)=[100006], E(quote)=[100008]}, 100006={A(AddToken)=[100007]}, 100007={S(SText)=[7]}, 100008={A(SetName)=[100009]}, 100009={S(state0)=[0]}})
```

3) Intersect both automatons and search for any accepting 
path. If such a path exists, then it proves that formula is
wrong for the provided model. 

### Resources

1) [Верификация автоматных программ, С. Э. Вельдер, М. А. Лукин, А. А. Шалыто, Б. Р., ИТМО, стр. 62-71](https://books.ifmo.ru/book/659/verifikaciya_avtomatnyh_programm.htm)
2) [Linear temporal logic to Büchi automaton (wiki)](https://en.wikipedia.org/wiki/Linear_temporal_logic_to_B%C3%BCchi_automaton)