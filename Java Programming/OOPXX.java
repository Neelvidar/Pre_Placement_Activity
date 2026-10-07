class Arithmatic {
    public int No1;
    public int No2;

    public Arithmatic() // Default Constructor
    {
        this.No1 = 0;
        this.No2 = 0;
    }

    public Arithmatic(int i, int j) // Parameterized Constructor
    {
        this.No1 = i;
        this.No2 = j;
    }

    public int Addition() {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;
    }

    public int Substraction() {
        int Ans = 0;
        Ans = this.No1 - this.No2;
        return Ans;
    }
}

class OOPXX {
    public static void main(String A[]) {
        Arithmatic aobj1 = new Arithmatic(21, 10);

        int result = 0;
        result = aobj1.Addition();
        System.out.println("Addition is : " + result);

        result = aobj1.Substraction();
        System.out.println("Substraction is :" + result);
    }
}