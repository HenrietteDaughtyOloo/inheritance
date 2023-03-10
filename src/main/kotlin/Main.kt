fun main(){
    var car=Car("Toyota", "Legacy", "black", 25)
    car.carry(30)
    car.identify()
    println(car.calculateParkingFees(12))
    var bus = Bus("XXX", "Scania", "black", 56)
    println( bus.maxTripFare(1000.00))
    println(bus.calculateParkingFees(10))
}
//Create a class Car with the following attributes: make, model, color, capacity.
open class Car(var make:String, var model:String, var color:String, var capacity:Int) {

//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
    fun carry(people:Int){
        var x =  people - capacity
        if (people<=capacity)
            println("Carrying $people passengers")
        else(println("Over Capacity by $x people"))
    }


//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
    fun identify(){
        println("Iam a $color $make $model")
    }
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)
    open fun calculateParkingFees(hours: Int):Int{
        var parkingFees =hours * 20
    return parkingFees
    }
}
//Create a class Bus with the same attributes and functions as the Car class.
class Bus(make: String, model: String, color: String, capacity: Int):Car(make,model,color,capacity) {

    //In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
    fun maxTripFare(fare: Double): Double {
        var maximum = capacity * fare
        return maximum
    }

    //The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)
    /*fun calculateParkingFeesMethod(hours:Int):Int{
        var parkingFees = capacity * hours
                return parkingFees*/
    override fun calculateParkingFees(hours: Int):Int {
        return hours*capacity
    }
}