/**
 * Windows on the desktop are just one of many objects used in a graphical user interface (GUI)-- buttons, drop-down list boxes, pop-up menus, are just some of the many others. Regardless of their particular appearance, tasks, and structure, all such GUI components share some common functionality-- which is handled in a manner unique to the actual component.

Define an interface, GUIComponent, with the following methods :

(i)onClick
void returning and accepts a single integer parameter

(ii)onCursorFocus
void returning and accept no parameters

(iii)move 
3 overloaded methods, all boolean returning
one accepts a pair of integer parameters
the second a single parameter of type Position
the third a single parameter of type Dimension

(iv)resize
2 overloaded methods, both booleanreturning
one accepts a pair of integer parameters
the second a single parameter of type Dimension
 */

interface GUIComponent {
    void onClick(int howMany);
    void onCursorFocus(int howMany);
    boolean move(int x, int y);
    boolean move(Position p);
    boolean resize(int width, int height);
    boolean move(Dimension d);
}