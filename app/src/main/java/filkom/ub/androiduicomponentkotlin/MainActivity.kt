package filkom.ub.androiduicomponentkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView = recycler_cardview
        val itemList = mutableListOf<ExpandableCardViewAdapter.Item>()


        val archetypes = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Archetypes")
        archetypes.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Login/Register"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Stream"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Detail"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Creation"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Profile"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "ProfileData", "Archetypes"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Settings"))

        val extraArchetypes = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Extra Archetypes")
        extraArchetypes.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Splash Pages"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Onboarding"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Map View"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Messaging"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Calendar"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Media Players"))

        itemList.add(archetypes)
        itemList.add(extraArchetypes)

        cardView.layoutManager = LinearLayoutManager(this)
        cardView.adapter = ExpandableCardViewAdapter(itemList)

        /*
        Material
         */

        val cardViewMaterial = recycler_cardview_material
        val materialItemList = mutableListOf<ExpandableCardViewAdapter.Item>()


        val bottomNavigation = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Bottom Navigation")
        bottomNavigation.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic","Bottom Navigation"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Shifting","Bottom Navigation"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Light","Bottom Navigation"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Dark","Bottom Navigation"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Icon","Bottom Navigation"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Primary","Bottom Navigation"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Map Blue","Bottom Navigation"))

        val bottomSheet = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Bottom Sheet")
        bottomSheet.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "List"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Map"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Floating"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Full"))




        val buttons = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Buttons")
        buttons.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Button in Utilities"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Fab Middle"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Fab More"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Fab More Text"))

        val cards = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Cards")
        cards.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Timeline"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Overlap"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Wizard"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Wizard Light"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Wiazard Overlap"))

        val chips = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Chips")
        chips.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Tag"))

        val dialogs = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Dialogs")
        dialogs.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Fullscreen"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Custom"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Custom Info"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Custom Warning"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Custom Light"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Custom Dark"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Custom Add Post"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Custom Add Review"))

        val expansionPanels = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Expansion Panels")
        expansionPanels.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Invoice"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Ticket"))


        val grid = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Grid")
        grid.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Single Line"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Two Line"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Sectioned"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Albums"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Caller"))

        val lists = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Lists")
        lists.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Sectioned"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Animation"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Expand"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Draggable"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Swipe"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Multi Selection"))

        val menu = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Menu")
        menu.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Drawer News"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Drawer Mail"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Drawer Simple Light"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Drawer Simple Dark"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Drawer No Icon"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Overflow Toolbar"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Overflow List"))

        val pickers = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Pickers")
        pickers.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Date Light","Pickers"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Date Dark","Pickers"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Time Light","Pickers"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Time Dark","Pickers"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Color RGB","Pickers"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Location","Pickers"))

        val progressActivity = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Progress & Activity")
        progressActivity.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Linear Center"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Linear Top"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Circle Center"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "On Scroll"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Pull Refresh"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Dots Bounce"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Dots Fade"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Dots Grow"))

        val sliders = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Sliders")
        sliders.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Light"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Dark"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Color Picker"))



        val snackbarsToats = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Snackbards & Toasts")
        snackbarsToats.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Basic","Snackbards & Toasts"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Lift FAB","Snackbards & Toasts"))

        val steppers = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Steppers")
        steppers.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Splash Pages"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Onboarding"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Map View"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Messaging"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Calendar"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Media Players"))

        val tabs = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Tabs")
        tabs.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Splash Pages"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Onboarding"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Map View"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Messaging"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Calendar"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Media Players"))

        val form = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Form")
        form.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Splash Pages"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Onboarding"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Map View"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Messaging"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Calendar"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Media Players"))

        val toolbars = ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.PARENT, "Toolbars")
        toolbars.children = listOf(
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Splash Pages"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Onboarding"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Map View"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Messaging"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Calendar"),
                ExpandableCardViewAdapter.Item(ExpandableCardViewAdapter.CHILD, "Media Players"))



        materialItemList.add(bottomNavigation)
        materialItemList.add(bottomSheet)
        materialItemList.add(buttons);
        materialItemList.add(cards)
        materialItemList.add(chips)
        materialItemList.add(dialogs)
        materialItemList.add(expansionPanels)
        materialItemList.add(grid)
        materialItemList.add(lists)
        materialItemList.add(menu)
        materialItemList.add(pickers)
        materialItemList.add(progressActivity)
        materialItemList.add(sliders)
        materialItemList.add(snackbarsToats)
        materialItemList.add(steppers)
        materialItemList.add(tabs)
        materialItemList.add(form)
        materialItemList.add(toolbars)


        cardViewMaterial.layoutManager = LinearLayoutManager(this)
        cardViewMaterial.adapter = ExpandableCardViewAdapter(materialItemList)
    }
}
