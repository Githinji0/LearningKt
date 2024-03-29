fun main() {
    //The most basic use case for enum classes is the implementation of type-safe enums:
   for (i in Direction.values()){
       println(Direction)

   }
}

enum class Direction(var direction: String,var distance: Int) {
    North("north",12),
    South("south",12),
    east("east",16),
    west("west",145)
}
