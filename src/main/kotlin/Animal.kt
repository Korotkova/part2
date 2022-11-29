open class Animal (var nameAnimal:String, var homeAnimal:String, var food:String) {

    override fun toString(): String {
        return "Animal: " + nameAnimal + " live in " + homeAnimal + " and eat food " + food + "\n"
    }
}