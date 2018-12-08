PopUpMenu
===============

### INTRODUCTION
All modern mobile apps often need to provide users with the ability to display or execute secondary content or actions that are related to a specific activity. The most common actions for an activity usually reside on the default Action Bar, but actions that are more specific to an item or element can be displayed contextually using PopUpMenus. This tutorial covers how to create and manage popup menus within you android application. 

#### Major Purpose
A PopupMenu displays a menu in a modal popup window that is anchored to a particular View within an activity. It generally contains subsidiary information or allows for secondary actions on an item. It commonly provides an overflow style menu for actions that are related to specific content, for example, triggering a reply to a message. When selected, the popup menu will appear below the anchor view if there is room, or above it if there is no space. Touching outside of the popup will dismiss it. Below is a visual representation of the PopupMenu.

An exam of a Popup Menu
![](https://github.com/dchristie75/CENG319/images/master/images/popupmenu.png)


### HISTORY 
The PopUpMenu was introduced in with API level 11 (Android 3.0). But if you are using above Android 3.0 the Popup Menu does not support any item shortcuts and item icons in the menu. The PopUpMenu originates from the class: android.widget.PopupMenu which is the direct subclass of the java.lang.Object class.

#### Major Methods/Attributes
The PopUpMenu makes use of a few constructors and methods. Here are a list of them and their uses: 

##### Public Constructors
- PopupMenu(Context context, View anchor) - Constructor to create a new popup menu with an anchor view.

- PopupMenu(Context context, View anchor, int gravity) - Constructor to create a new popup menu with an anchor view and alignment gravity

- PopupMenu(Context context, View anchor, int gravity, int popupStyleAttr, int popupStyleRes) - Constructor a create a new popup menu with 
a specific style

##### Public Methods
- Public void dismiss() – used to dismiss the menu popup

- Public int getGravity() - used to align the popup window to its anchor view

- Public View.OnTouchListener getDragToOpenListener() - Returns an View.OnTouchListener that can be added to the anchor view to           implement drag-to-open behavior

- Public Menu getMenu() – returns the Menu associated with this popup
- Public MenuInflater getMenuInflater() - a MenuInflater that can be used to inflate menu items from XML into the menu returned by                                                 getMenu()
- Public void inflate(int menuRes) - Inflate a menu resource into this PopupMenu
- Public void setGravity(int gravity) - Sets the gravity used to align the popup window to its anchor view
- Public void setOnDismissListener(PopupMenu.OnDismissListener listener) - sets a listener that will be notified when this menu is         dismissed
- Public void setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener listener) - Sets a listener that will be notified when the     user selects an item from the menu
- Public void show() - show the menu popup anchored to the view specified during construction.

### Methods Use In My Project

- setOnClickListener(new View.OnClickListener())
- PopupMenu(Context context, View anchor)
- setOnMenuItemClickListener (PopupMenu.OnMenuItemClickListener listener)
- inflate(int menuRes)


### How create the PopUpMenu

Step 1: Create a new folder menu inside of your project resource directory

![](https://github.com/dchristie75/CENG319/blob/master/images/step1.PNG)

Step 2: Add a new XML file in the menu directoy to build the menu

![](https://github.com/dchristie75/CENG319/blob/master/images/step2.PNG)

Step 3: Create a view element to anchored the menu

![](https://github.com/dchristie75/CENG319/blob/master/images/step3.PNG)

Step 4: In your main activity implement the showPopup method to instantiate the Popup constructor and use MenuInflater to load the               defined menu resource using the MenuInflater.inflate() method. Handle Android Popup Menu Click Events by implementing the               PopupMenu.OnMenuItemClickListener interface and register it with your PopupMenu by calling setOnMenuItemclickListener().

![](https://github.com/dchristie75/CENG319/blob/master/images/step5.PNG)  

Step 5: Create an onMenuItemClick method to implement the individual menu items 

![](https://github.com/dchristie75/CENG319/blob/master/images/step4.PNG)


### Code
A sample code of the program can be found [here](https://github.com/dchristie75/CENG319/tree/master/code)


### Example Program
The full example of the popup menu program can be found [here](https://github.com/dchristie75/CENG319/tree/master/PopUpMenu_Example)


### Referencs

https://developer.android.com/reference/android/widget/PopupMenu

https://www.tutlane.com/tutorial/android/android-popup-menu-with-examples

