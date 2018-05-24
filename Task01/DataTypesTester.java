package by.dyagel;

public class DataTypesTester {
    public static void testByte() {
        System.out.println("\n***************BYTE***********************");
        byte a = 127, b = 35, c;
        System.out.println("\n******* Arithmetical Operators ******");
        //addition
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 9;
        //unary minus
        c = (byte) (-a);
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (byte) (+a);
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 9;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 9;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 9;
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        a = 9;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n******* Bitwise Operators ******");

        //bitwise And
        c = (byte) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise OR
        c = (byte) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise XOR
        c = (byte) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise unary compliment
        c = (byte) (~a);
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //left shift
        c = (byte) (a << 2);
        System.out.printf("%d << 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //right shift
        c = (byte) (a >> 2);
        System.out.printf("%d >> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -127;
        //left shift
        c = (byte) (a << 2);
        System.out.printf("%d << 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //right shift
        c = (byte) (a >> 2);
        System.out.printf("%d >> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //zero fill right shift
        c = (byte) (a >>> 2);
        System.out.printf("%d >>> 10 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 10 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 126;
        //zero fill right shift
        c = (byte) (a >>> 2);
        System.out.printf("%d >>> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n ********* Assignment Operators ***********");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 125;
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("\n *********Relational Operators ***********");

        // grater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // grater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

        //logical AND
        System.out.printf("(%d > %d) && (%d >0)-->%b\n", a, b, a, (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d >0)-->%b\n", a, b, a, (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%d >= %d) || (%d != 0)-->%b\n", a, b, b, (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0)-->%b\n", a, b, b, (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0)-->%b\n", a, b, b, (a >= b) ^ (b != 0));
        //logical NOT
        System.out.printf("!(%d >= %d)-->%b\n", a, b, !(a >= b));

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        int i = 10;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.987;
        boolean bool = true;

        c = (byte) i;
        System.out.printf("byte=int: c = (byte)%d --> c = %d\n", i, c);
        c = (byte) sh;
        System.out.printf("byte=short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("byte=char: c = (byte)'%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte=long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte=float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte=double: c = (byte)%f --> c = %d\n", d, c);
        //c=(byte)bool;
        System.out.printf("byte=boolean: c = (byte)%b --> Compile Error cannot cast boolean to byte\n", bool);
    }

    public static void testShort() {
        System.out.println("\n***************SHORT***********************");
        short a = 128, b = 12, c;
        System.out.println("\n******* Arithmetical Operators ******");

        //addition
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 9;
        //unary minus
        c = (short) (-a);
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (short) (+a);
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 9;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 9;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 9;
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        a = 9;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n******* Bitwise Operators ******");

        //bitwise And
        c = (short) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise OR
        c = (short) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise XOR
        c = (short) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise unary compliment
        c = (short) (~a);
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //left shift
        c = (short) (a << 2);
        System.out.printf("%d << 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //right shift
        c = (short) (a >> 2);
        System.out.printf("%d >> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        //left shift
        c = (short) (a << 2);
        System.out.printf("%d << 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //right shift
        c = (short) (a >> 2);
        System.out.printf("%d >> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //zero fill right shift
        c = (short) (a >>> 2);
        System.out.printf("%d >>> 10 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 10 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 5;
        //zero fill right shift
        c = (short) (a >>> 2);
        System.out.printf("%d >>> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n ********* Assignment Operators ***********");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 1236;
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("\n *********Relational Operators ***********");

        // grater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // grater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

        //logical AND
        System.out.printf("(%d > %d) && (%d >0)-->%b\n", a, b, a, (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d >0)-->%b\n", a, b, a, (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%d >= %d) || (%d != 0)-->%b\n", a, b, b, (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0)-->%b\n", a, b, b, (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0)-->%b\n", a, b, b, (a >= b) ^ (b != 0));
        //logical NOT
        System.out.printf("!(%d >= %d)-->%b\n", a, b, !(a >= b));

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        int i = -320000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.987;
        boolean bool = true;

        c = bt;
        System.out.printf("short=byte: c = %d --> c = %d\n", bt, c);
        c = (short) i;
        System.out.printf("short=int: c = (short)%d --> c = %d\n", i, c);
        c = (short) ch;
        System.out.printf("short=char: c = (short)'%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short=long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short=float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short=double: c = (short)%f --> c = %d\n", d, c);
        //c=(short)bool;
        System.out.printf("short=boolean: c = (short)%b --> Compile Error\n", bool);

    }

    public static void testChar() {
        System.out.println("\n***************CHAR***********************");
        char a = 'a', b = 'b', c;
        System.out.println("\n******* Arithmetical Operators ******");

        //addition
        c = (char) (a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);
        //subtraction
        c = (char) (a - b);
        System.out.printf("%c - %c =%c\n", a, b, c);
        //multiplication
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);
        //division
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);
        //modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);

        a = '1';
        //unary minus
        c = (char) (-a);
        System.out.printf("-%c = %c\n", a, c);
        //unary plus
        c = (char) (+a);
        System.out.printf("+%c = %c\n", a, c);
        //prefix increment
        a = '1';
        System.out.printf("++%c = %c\n", a, ++a);
        //postfix increment
        a = '1';
        System.out.printf("%c++ = %c\n", a, a++);
        //prefix decrement
        a = '1';
        System.out.printf("--%c = %c\n", a, --a);
        //postfix decrement
        a = '1';
        System.out.printf("%c-- = %c\n", a, a--);

        System.out.println("\n******* Bitwise Operators ******");

        //bitwise And
        c = (char) (a & b);
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise OR
        c = (char) (a | b);
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise XOR
        c = (char) (a ^ b);
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise unary compliment
        c = (char) (~a);
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //left shift
        c = (char) (a << 2);
        System.out.printf("%c << 2 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //right shift
        c = (char) (a >> 2);
        System.out.printf("%c >> 2 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = '8';
        //left shift
        c = (char) (a << 2);
        System.out.printf("%c << 2 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //right shift
        c = (char) (a >> 2);
        System.out.printf("%c >> 2 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //zero fill right shift
        c = (char) (a >>> 2);
        System.out.printf("%c >>> 10 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 10 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = '8';
        //zero fill right shift
        c = (char) (a >>> 2);
        System.out.printf("%c >>> 2 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n ********* Assignment Operators ***********");

        a = '8';
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        a = '8';
        System.out.printf("%c >>= %c --> c = %c\n", c, a, c >>= a);
        System.out.printf("%c <<= %c --> c = %c\n", c, a, c <<= a);
        System.out.printf("%c >>>= %c --> c = %c\n", c, a, c >>>= a);

        System.out.println("\n *********Relational Operators ***********");

        // grater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        // grater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        // equal to
        System.out.printf("%c ==%c --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

        //logical AND
        System.out.printf("(%c > %c) && (%c >0)-->%b\n", a, b, a, (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%c > %c) & (%c >0)-->%b\n", a, b, a, (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%c > %c) || (%c >0)-->%b\n", a, b, b, (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%c > %c) | (%c >0)-->%b\n", a, b, b, (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%c > %c) ^ (%c >0)-->%b\n", a, b, b, (a >= b) ^ (b != 0));
        //logical NOT
        System.out.printf("!(%c >= %c)-->%b\n", a, b, !(a >= b));

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        int i = -320000;
        short sh = 22222;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.987;
        boolean bool = true;

        c = (char) bt;
        System.out.printf("char=byte: c = (char)%d --> c = %c\n", bt, c);
        c = (char) i;
        System.out.printf("char=int: c = (char)%d --> c = %c\n", i, c);
        c = (char) sh;
        System.out.printf("char=short: c = (char)%d --> c = %c\n", sh, c);
        c = (char) l;
        System.out.printf("char=long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char=float: c = (char)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char=double: c = (char)%f --> c = %c\n", d, c);
        //c=(short)bool;
        System.out.printf("char=boolean: c = (char)%b --> Compile Error\n", bool);

    }

    public static void testInt() {
        System.out.println("\n***************INT***********************");
        int a = 8, b = 2, c;
        System.out.println("\n******* Arithmetical Operators ******");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 9;
        //unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 9;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 9;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 9;
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        a = 9;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n******* Bitwise Operators ******");

        //bitwise And
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //left shift
        c = a << 2;
        System.out.printf("%d << 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //right shift
        c = a >> 2;
        System.out.printf("%d >> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        //left shift
        c = a << 2;
        System.out.printf("%d << 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //right shift
        c = a >> 2;
        System.out.printf("%d >> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        //zero fill right shift
        c = a >>> 10;
        System.out.printf("%d >>> 10 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 10 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 5;
        //zero fill right shift
        c = a >>> 2;
        System.out.printf("%d >>> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n ********* Assignment Operators ***********");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 123456;
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("\n *********Relational Operators ***********");

        // grater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // grater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

        //logical AND
        System.out.printf("(%d > %d) && (%d >0)-->%b\n", a, b, a, (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d >0)-->%b\n", a, b, a, (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%d >= %d) || (%d != 0)-->%b\n", a, b, b, (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0)-->%b\n", a, b, b, (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0)-->%b\n", a, b, b, (a >= b) ^ (b != 0));
        //logical NOT
        System.out.printf("!(%d >= %d)-->%b\n", a, b, !(a >= b));

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.987;
        boolean bool = true;

        c = bt;
        System.out.printf("int=byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int=short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int=char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int=long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int=float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int=double: c = (int)%f --> c = %d\n", d, c);
        //c=(int)bool;
        System.out.printf("int=boolean: c = (int)%b --> Compile Error\n", bool);


    }

    public static void testLong() {
        System.out.println("\n***************LONG***********************");
        long a = 80000000000000000L, b = 200000000000000L, c;
        System.out.println("\n******* Arithmetical Operators ******");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 9000000000000000000L;
        //unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 9000000000000000000L;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 9000000000000000000L;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 9000000000000000000L;
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        a = 9000000000000000000L;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n******* Bitwise Operators ******");

        //bitwise And
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        //bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        //bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        //left shift
        c = a << 2;
        System.out.printf("%d << 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        //right shift
        c = a >> 2;
        System.out.printf("%d >> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = -5000000000000000000L;
        //left shift
        c = a << 2;
        System.out.printf("%d << 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 2 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        //right shift
        c = a >> 2;
        System.out.printf("%d >> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 2 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        //zero fill right shift
        c = a >>> 10;
        System.out.printf("%d >>> 10 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 10 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = 5;
        //zero fill right shift
        c = a >>> 2;
        System.out.printf("%d >>> 2 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 2 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        System.out.println("\n ********* Assignment Operators ***********");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 123456;
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("\n *********Relational Operators ***********");

        // grater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // grater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

        //logical AND
        System.out.printf("(%d > %d) && (%d >0)-->%b\n", a, b, a, (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d >0)-->%b\n", a, b, a, (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%d >= %d) || (%d != 0)-->%b\n", a, b, b, (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0)-->%b\n", a, b, b, (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0)-->%b\n", a, b, b, (a >= b) ^ (b != 0));
        //logical NOT
        System.out.printf("!(%d >= %d)-->%b\n", a, b, !(a >= b));

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int i = 12345;
        float f = 1.9f;
        double d = 123456789.987;
        boolean bool = true;

        c = bt;
        System.out.printf("long=byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long=short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long=char: c = '%c' --> c = %d\n", ch, c);
        c = i;
        System.out.printf("long=int: c = (int)%d --> c = %d\n", i, c);
        c = (long) f;
        System.out.printf("long=float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long=double: c = (long)%f --> c = %d\n", d, c);
        //c=(long)bool;
        System.out.printf("long=boolean: c = (long)%b --> Compile Error\n", bool);

    }

    public static void testFloat() {
        System.out.println("\n***************FLOAT***********************");
        float a = 12.34f, b = 2.222228f, c;
        System.out.println("\n******* Arithmetical Operators ******");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        a = 1234e-2f;
        //unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        //prefix increment
        a = 1234e-2f;
        System.out.printf("++%f = %f\n", a, ++a);
        //postfix increment
        a = 1234e-2f;
        System.out.printf("%f++ = %f\n", a, a++);
        //prefix decrement
        a = 1234e-2f;
        System.out.printf("--%f = %f\n", a, --a);
        //postfix decrement
        a = 1234e-2f;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n******* Bitwise Operators ******");

        System.out.println("\nbitwise operators cant be used with float");
//        //bitwise And
//        c = a & b;
//        System.out.printf("%f & %f = %f\n", a, b, c);
//
//        //bitwise OR
//        c = a | b;
//        System.out.printf("%f | %f = %f\n", a, b, c);
//
//        //bitwise XOR
//        c = a ^ b;
//        System.out.printf("%f ^ %f = %f\n", a, b, c);
//
//        //bitwise unary compliment
//        c = ~a;
//        System.out.printf("~%f = %f\n", a, c);
//
//        //left shift
//        c = a << 2;
//        System.out.printf("%f << 2 = %f\n", a, c);
//
//        //right shift
//        c = a >> 2;
//        System.out.printf("%f >> 2 = %f\n", a, c);
//
//        //left shift
//        c = a << 2;
//        System.out.printf("%f << 2 = %f\n", a, c);
//
//        //right shift
//        c = a >> 2;
//        System.out.printf("%f >> 2 = %f\n", a, c);
//
//        //zero fill right shift
//        c = a >>> 10;
//        System.out.printf("%f >>> 10 = %f\n", a, c);
//
//        //zero fill right shift
//        c = a >>> 2;
//        System.out.printf("%f >>> 2 = %f\n", a, c);


        System.out.println("\n ********* Assignment Operators ***********");

        c = 7.07f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
//        System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
//        System.out.printf("%f &= %f --> c = %f\n", c, a, c &= a);
//        System.out.printf("%f ^= %f --> c = %f\n", c, a, c ^= a);
//        System.out.printf("%f >>= %f --> c = %f\n", c, a, c >>= a);
//        System.out.printf("%f <<= %f --> c = %f\n", c, a, c <<= a);
//        System.out.printf("%f >>>= %f --> c = %f\n", c, a, c >>>= a);

        System.out.println("\n *********Relational Operators ***********");

        // grater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // grater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

        //logical AND
        System.out.printf("(%f > %f) && (%f >0)-->%b\n", a, b, a, (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%f > %f) & (%f >0)-->%b\n", a, b, a, (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%f >= %f) || (%f != 0)-->%b\n", a, b, b, (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0)-->%b\n", a, b, b, (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%f >= %f) ^ (%f != 0)-->%b\n", a, b, b, (a >= b) ^ (b != 0));
        //logical NOT
        System.out.printf("!(%f >= %f)-->%b\n", a, b, !(a >= b));

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        int i = 1999;
        double d = 123456789.987;
        boolean bool = true;

        c = bt;
        System.out.printf("float=byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float=short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float=char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("float=long: c = %d --> c = %f\n", l, c);
        c = i;
        System.out.printf("float=int: c = %d --> c = %f\n", i, c);
        c = (float) d;
        System.out.printf("float=double: c = (float)%f --> c = %f\n", d, c);
        //c=(float)bool;
        System.out.printf("float=boolean: c = (float)%b --> Compile Error\n", bool);


    }

    public static void testDouble() {
        System.out.println("\n***************DOUBLE***********************");
        double a = 12.3333, b = 2.222228, c;
        System.out.println("\n******* Arithmetical Operators ******");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        a = 1.234e2d;
        //unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        //prefix increment
        a = 1.234e2d;
        System.out.printf("++%f = %f\n", a, ++a);
        //postfix increment
        a = 1.234e2d;
        System.out.printf("%f++ = %f\n", a, a++);
        //prefix decrement
        a = 1.234e2d;
        System.out.printf("--%f = %f\n", a, --a);
        //postfix decrement
        a = 1.234e2d;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n******* Bitwise Operators ******");

        System.out.println("\nbitwise operators cant be used with double");
//        //bitwise And
//        c = a & b;
//        System.out.printf("%f & %f = %f\n", a, b, c);
//
//        //bitwise OR
//        c = a | b;
//        System.out.printf("%f | %f = %f\n", a, b, c);
//
//        //bitwise XOR
//        c = a ^ b;
//        System.out.printf("%f ^ %f = %f\n", a, b, c);
//
//        //bitwise unary compliment
//        c = ~a;
//        System.out.printf("~%f = %f\n", a, c);
//
//        //left shift
//        c = a << 2;
//        System.out.printf("%f << 2 = %f\n", a, c);
//
//        //right shift
//        c = a >> 2;
//        System.out.printf("%f >> 2 = %f\n", a, c);
//
//        //left shift
//        c = a << 2;
//        System.out.printf("%f << 2 = %f\n", a, c);
//
//        //right shift
//        c = a >> 2;
//        System.out.printf("%f >> 2 = %f\n", a, c);
//
//        //zero fill right shift
//        c = a >>> 10;
//        System.out.printf("%f >>> 10 = %f\n", a, c);
//
//        //zero fill right shift
//        c = a >>> 2;
//        System.out.printf("%f >>> 2 = %f\n", a, c);


        System.out.println("\n ********* Assignment Operators ***********");

        c = 7.07;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
//        System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
//        System.out.printf("%f &= %f --> c = %f\n", c, a, c &= a);
//        System.out.printf("%f ^= %f --> c = %f\n", c, a, c ^= a);
//        System.out.printf("%f >>= %f --> c = %f\n", c, a, c >>= a);
//        System.out.printf("%f <<= %f --> c = %f\n", c, a, c <<= a);
//        System.out.printf("%f >>>= %f --> c = %f\n", c, a, c >>>= a);

        System.out.println("\n *********Relational Operators ***********");

        // grater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // grater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

        //logical AND
        System.out.printf("(%f > %f) && (%f >0)-->%b\n", a, b, a, (a > b) && (a > 0));
        //bitwise logical AND
        System.out.printf("(%f > %f) & (%f >0)-->%b\n", a, b, a, (a > b) & (a > 0));
        //logical OR
        System.out.printf("(%f >= %f) || (%f != 0)-->%b\n", a, b, b, (a >= b) || (b != 0));
        //bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0)-->%b\n", a, b, b, (a >= b) | (b != 0));
        //logical XOR
        System.out.printf("(%f >= %f) ^ (%f != 0)-->%b\n", a, b, b, (a >= b) ^ (b != 0));
        //logical NOT
        System.out.printf("!(%f >= %f)-->%b\n", a, b, !(a >= b));

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        int i = 1999;
        float f = 123456789.987f;
        boolean bool = true;

        c = bt;
        System.out.printf("double=byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double=short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double=char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("double=long: c = %d --> c = %f\n", l, c);
        c = i;
        System.out.printf("double=int: c = %d --> c = %f\n", i, c);
        c = f;
        System.out.printf("double=float: c = %f --> c = %f\n", f, c);
        //c=(float)bool;
        System.out.printf("double=boolean: c = (float)%b --> Compile Error\n", bool);


    }

    public static void testBoolean() {
        System.out.println("\n***************BOOLEAN***********************");
        boolean a = true, b = false, c;

        System.out.println("\n******* Arithmetical Operators ******");

//        //addition
//        c = a + b;
//        //subtraction
//        c = a - b;
//        //multiplication
//        c = a * b;
//        //division
//        c = a / b;
//        //modulus
//        c = a % b;
//        //unary minus
//        c = -a;
//        //unary plus
//        c = +a;
//        c = ++a;
//        c = --a;
//        c = a++;
//        c = a--;

        System.out.println("\n******* Bitwise Operators ******");

        //bitwise And
        c = a & b;
        System.out.printf("%b & %b = %b\n", a, b, c);
        //bitwise OR
        c = a | b;
        System.out.printf("%b | %b = %b\n", a, b, c);
        //bitwise XOR
        c = a ^ b;
        System.out.printf("%b ^ %b = %b\n", a, b, c);

//        c = ~a;
//        c = a << 1;
//        c = a >> 1;
//        c = a >>> 1;

        System.out.println("\n ********* Assignment Operators ***********");

        System.out.printf("%b |=%b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

//        c+=a;
//        c-=a;
//        c*=a;
//        c/=a;
//        c%=a;
//        c>>=a;
//        c<<=a;
//        c>>>=a;

        System.out.println("\n *********Relational Operators ***********");
        // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
//        c = a > b;
//        c = a >= b;
//        c = a < b;
//        c = a <= b;

        System.out.println("\n *********Logical Operators ***********");

        //logical AND
        c = a && b;
        System.out.printf("%b && %b-->%b\n", a, b, c);

        //logical OR
        c = a || b;
        System.out.printf("%b || %b-->%b\n", a, b, c);
        //logical XOR
        c = a ^ b;
        System.out.printf("%b ^ %b-->%b\n", a, b, c);
        //logical NOT
        System.out.printf("!%b-->%b\n", a, !a);

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));

        System.out.println("\nType Cast Operator:");

//        byte bt = 1;
//        short sh = -32000;
//        char ch = '\u0002';
//        long l = 100000000000000000L;
//        int i = 1999;
//        float f = 123456789.987f;
//        double d = 12.12d;
        boolean bool = true;

//        c=(boolean)bt;
//        c=(boolean)sh;
//        c=(boolean)ch;
//        c=(boolean)l;
//        c=(boolean)f;
//        c=(boolean)d;

        c = bool;
    }

    public static void testString() {
        System.out.println("\n***************STRING***********************");

        String a = "Hello", b = "World!", c;

        System.out.println("\n******* Arithmetical Operators ******");
        //addition
        c = a + b;
        System.out.printf("%s + %s = %s\n", a, b, c);
//        c = a - b;
//        c = a * b;
//        c = a / b;
//        c = a % b;
//        c = -a;
//        c = +a;
//        ++a;
//        a++
//        --a;
//        a--;

        System.out.println("\n******* Bitwise Operators ******");

//        c = a & b;
//        c = a | b;
//        c = a ^ b;
//        c = ~a;
//        c = a << 2;
//        c = a >> 2;
//        a = -5;
//        c = a << 2;
//        c = a >> 2;
//        c = a >>> 10;
//        c = a >>> 2;

        System.out.println("\n ********* Assignment Operators ***********");

        c = "Hello world";
        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);

//        c -= a;
//        c *= a;
//        c /= a;
//        c %= a;
//        c |= a;
//        c &= a;
//        c ^= a;
//        c <<= a;
//        c >>= a;
//        c >>>= a;

        System.out.println("\n *********Relational Operators ***********");

//        a>b;
//        a>=b;
//        a<b;
//        a<=b;

        // equal to
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%s != %s --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

//        a && b;
//        a & b;
//        a || b;
//        a | b;
//        a ^ b;
//        a && b;
//        !a;

        System.out.println("\n******* Misc Operators ********");
        System.out.println("\nCondition Operator:");

        System.out.printf("%s == %s ? %s : %s --> %s\n", a, b, a, b, (a == b ? a : b));

//        System.out.println("\nType Cast Operator:");

//        byte bt = 1;
//        short sh = -32000;
//        char ch = '\u0002';
//        int i = 555;
//        long l = 100000000000000000L;
//        float f = 1.9f;
//        double d = 123456789.987;
//        boolean bool = true;
//
//        c=(String)bt;
//        c=(String)sh;
//        c=(String)ch;
//        c=(String)i;
//        c=(String)l;
//        c=(String)f;
//        c=(String)d;
//        c=(String)bool;

        System.out.println("\nReference Test Operator:");
        System.out.printf("%s instance of String --> %b",c,c instanceof String);
    }

    public static void testStudent(){
        System.out.println("\n***************STUDENT***********************");

        Student a=new Student("Alexander",10);
        Student b=new Student("Vladislav",2);
        Student c;

        System.out.println("\n******* Arithmetical Operators ******");
//        c = a + b;
//        c = a - b;
//        c = a * b;
//        c = a / b;
//        c = a % b;
//        c = -a;
//        c = +a;
//        ++a;
//        a++
//        --a;
//        a--;

        System.out.println("\n******* Bitwise Operators ******");

//        c = a & b;
//        c = a | b;
//        c = a ^ b;
//        c = ~a;
//        c = a << 2;
//        c = a >> 2;
//        a = -5;
//        c = a << 2;
//        c = a >> 2;
//        c = a >>> 10;
//        c = a >>> 2;

        System.out.println("\n ********* Assignment Operators ***********");

//        c+=a;
//        c -= a;
//        c *= a;
//        c /= a;
//        c %= a;
//        c |= a;
//        c &= a;
//        c ^= a;
//        c <<= a;
//        c >>= a;
//        c >>>= a;

        System.out.println("\n *********Relational Operators ***********");

//        a>b;
//        a>=b;
//        a<b;
//        a<=b;

        // equal to
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%s != %s --> %b\n", a, b, a != b);

        System.out.println("\n *********Logical Operators ***********");

//        a && b;
//        a & b;
//        a || b;
//        a | b;
//        a ^ b;
//        a && b;
//        !a;

        System.out.println("\n******* Misc Operators ********");

        System.out.println("\nCondition Operator:");

        System.out.printf("%s == %s ? %s : %s --> %s\n", a, b, a, b, (a == b ? a : b));

//        System.out.println("\nType Cast Operator:");

//        byte bt = 1;
//        short sh = -32000;
//        char ch = '\u0002';
//        int i = 555;
//        long l = 100000000000000000L;
//        float f = 1.9f;
//        double d = 123456789.987;
//        boolean bool = true;
//
//        c=(Student)bt;
//        c=(Student)sh;
//        c=(Student)ch;
//        c=(Student)i;
//        c=(Student)l;
//        c=(Student)f;
//        c=(Student)d;
//        c=(Student)bool;

        System.out.println("\nReference Test Operator:");
        System.out.printf("%s instance of Student --> %b\n",a,a instanceof Student);
        System.out.printf("%s instance of Object --> %b\n",a,a instanceof Object);

    }

}

