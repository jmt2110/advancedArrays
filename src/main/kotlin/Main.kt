fun main(args: Array<String>) {
    var supplies = arrayOf("hot dogs", "buns", "mustard", "relish", "onion")
    var qty = arrayOf("15", "20", "10", "25", "30")

    for (i in 0..(supplies.size -1)){
        println("the ${supplies[i]} has ${qty[i]} units")
    }

    var inventory = arrayOf<Array<String>>()
    inventory += supplies
    inventory += qty

    var find = readLine()!!.toString()
    var found = false

    for (i in inventory[0]){
        if (i.equals(find)){
            found = true
            var p = inventory[0].indexOf(i)
            println("${inventory[0][p]} has ${inventory[1][p]} units")
            println("how many units would you like to add or subtract? \n(if subtracting please enter negative units)")
            var originalQty = inventory[1][p]
            var add = readLine()!!.toInt()
            var orgQty = originalQty.toInt()
            var new = (orgQty + add)
            if (new < 0){
                println("The quantity will be less than zero\nWe will change the quantity to zero")
                new = 0
            }
            var set = new.toString()
            inventory[1].set(p, set)

            println("Original Qty: $orgQty\nChange: $add\nNew Qty: ${new}")

            }
        }
    for (i in 0..(supplies.size -1)) {
        println("the ${inventory[0][i]} has ${inventory[1][i]} units")
    }
    }