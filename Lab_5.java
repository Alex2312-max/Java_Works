// I decided to make all the classes in one file, because it is faster and
// more comfortable to work in such format in IDEA
class Lab_5_Task_1{
    public static void main(String[] args) {
        A A1 = new A(new String("A"), new X("X1"));
        B B1 = new B("A", new X("X"));
        C C1 = new C("A", new X("X"));
        D D1 = new D("A", new X("X"));
        E E1 = new E("A", new X("X"));
        F F1 = new F("A", new X("X"));
        G G1 = new G("A", new X("X"));
        H H1 = new H("A", new X("X"));
        I I1 = new I("A", new X("X"));
        J J1 = new J("A", new X("X"));

        System.out.println(A1);
        System.out.println(B1);
        System.out.println(C1);
        System.out.println(D1);
        System.out.println(E1);
        System.out.println(F1);
        System.out.println(G1);
        System.out.println(H1);
        System.out.println(I1);
        System.out.println(J1);
    }

}

class A{
    protected String A;
    protected X X;
    {
        new X("X1");
    }

    public A(String A, X X) {
        this.A = A;
        this.X = X;
    }

    @Override
    public String toString() {
        return "A = {" + "A = " + A + ", X = " + X + "}";
    }
}

class B extends A{
    protected String B;

    public B(String A, X X) {
        super(A,X);
        this.B = "B";
    }

    @Override
    public String toString() {
        return "B = {" + "A = " + A + ", X = " + X + ", B = " + B + "}";
    }
}

class C extends B {
    protected String C;

    public C(String A, X X) {
        super(A, X);
        this.C = "C";
    }

    @Override
    public String toString() {
        return "C = {" + "A = " + A + ", X = " + X + ", B = " + B + ", C = "
                + C + "}";
    }
}

class D extends C {
    protected String D;

    public D(String A, X X) {
        super(A, X);
        this.D = "D";
    }

    @Override
    public String toString() {
        return "D = {" + "A = " + A + ", X = " + X + ", B = " + B + ", C = "
                + C + ", D = " + D + "}";
    }
}

class E extends D {
    protected String E;

    public E(String A, X X) {
        super(A, X);
        this.E = "E";
    }

    @Override
    public String toString() {
        return "E = {" + "A = " + A + ", X = " + X + ", B = " + B + ", C = "
                + C + ", D = " + D + ", E = " + E + "}";
    }
}

class F extends E {
    protected String F;

    public F(String A, X X) {
        super(A, X);
        this.F = "F";
    }

    @Override
    public String toString() {
        return "F = {" + "A = " + A + ", X = " + X + ", B = " + B + ", C = "
                + C + ", D = " + D + ", E = " + E + ", F = " + F + "}";
    }
}

class G extends F {
    protected String G;

    public G(String A, X X) {
        super(A, X);
        this.G = "G";
    }

    @Override
    public String toString() {
        return "G = {" + "A = " + A + ", X = " + X + ", B = " + B + ", C = "
                + C + ", D = " + D + ", E = " + E + ", F = " + F + ", G = " + G +"}";
    }
}

class H extends G {
    protected String H;
    private X X = new X("X3");

    public H(String A, X X) {
        super(A, X);
        this.H = "H";
    }

    @Override
    public String toString() {
        return "H = {" + "A = " + A + ", X = " + X + ", B = " + B + ", C = "
                + C + ", D = " + D + ", E = " + E + ", F = " + F + ", G = " + G +
                ", H = " + H + "}";
    }
}

class I extends H {
    protected String I;

    public I(String A, X X) {
        super(A, X);
        this.I = "I";
    }

    @Override
    public String toString() {
        return "I = {" + "A = " + A + ", X = " + ((G) this).X + ", B = " + B + ", C = "
                + C + ", D = " + D + ", E = " + E + ", F = " + F + ", G = " + G +
                ", H = " + H + ", I = " + I + "}";
    }
}

class J extends I {
    protected String J;
    private X X = new X("X2");

    public J(String A, X X) {
        super(A, X);
        this.J = "J";
    }

    @Override
    public String toString() {
        return "J = {" + "A = " + A + ", X = " + X + ", B = " + B + ", C = "
                + C + ", D = " + D + ", E = " + E + ", F = " + F + ", G = " + G +
                ", H = " + H + ", I = " + I + ", J = " + J + "}";
    }
}

class X{
    protected String X;

    public X(String X) {
        this.X = X;
    }

    @Override
    public String toString() {
        return "X = {" + "X = " + X + "}";
    }
}