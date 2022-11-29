fun main(args: Array<String>) {
    val listAnimalName = mutableListOf<Animal>(Herbivores("Caw",
                    "HomePeopleSaray", "Hay", "Herbivores"),
        Herbivores("Giraffe", "Africa",
                    "Tree leaves", "Herbivores"),
        Carnivores("Lion", "Africa",
                    "Meat", "Carnivores"))

    listAnimalName.add(Carnivores("Shark", "Sea",
                    "Fish", "Carnivores"))

    println(listAnimalName)
}