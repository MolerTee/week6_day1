class Bus {
  private int number;
  private Person[] passenger;

  public Bus(int number){
    this.number = number;
    this.passenger = new Person[5];
  }

  public int getNumber(){
    return this.number;
  }

  public void addPassenger(Person name) {
    if (isBusFull()) return;

    int passengerCount = passengerCount();
    passenger[passengerCount] = name;

  }

  public int passengerCount(){
    int count = 0;
    for (Person person : passenger) {
      if (person != null) {
        count += 1;
      }
    }
    return count;
  }

  public boolean isBusFull(){
    return passengerCount() == passenger.length;
  }

  public void depart() {
    for (int i = 0; i < passenger.length; i++){
      passenger[i] = null;
    }
  }
}