fun main() {
   val listView = ListView(arrayOf("nama1","name2","name3","name4"))

    listView.ListViewItem().displayItem(2)
}

class ListView(val items:Array<String>){
    inner class ListViewItem() {

        fun displayItem(position: Int){
            println(items[position])
        }
    }
}
