
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus (Money added){
        int sumEuros = this.euros + added.euros;
        int sumCents = this.cents + added.cents;
        
        if (sumCents > 100){
            sumEuros ++;
            sumCents -= 100;
           
        }
        return new Money(sumEuros, sumCents);
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros || this.euros == compared.euros && this.cents < compared.cents){
            return true;
        } 
        
        else {
            return false;
        }
    }
    
    public Money minus(Money decremented){
        int subtractEuros = this.euros - decremented.euros;
        int subtractCents = this.cents - decremented.cents;
        
        if (subtractEuros < 0){
            subtractEuros = 0;
            subtractCents = 0;
        }
        
        if (subtractCents < 0){
            subtractEuros --;
            subtractCents += 100;
        }   
        
        return new Money(subtractEuros,subtractCents);
    }
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
