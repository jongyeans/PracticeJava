package packages;

import packages.differentpackage.nested.TestClass;

import static java.lang.Math.PI;

public class main {

    public static void main(String[] args) {
        // Using "import" on packages.differentpackage.nested
        TestClass IMPORT = new TestClass();
        // Using FQN(Fully Qualified Name) on packages.differentpackage.nested
        packages.differentpackage.nested.TestClass FQN = new packages.differentpackage.nested.TestClass();
        // For explaining import .*
        packages.differentpackage.TestClass AnotherClass = new packages.differentpackage.TestClass();


//      Test w/ and wo/import static
        int radius = 1;

        // Case 1 : without import static
        // Math math = new Math();   // Error : Math's constructor is private

        // So we need to add "import static"
        double RoundLengthOfCircle = PI * radius;


    }
}
