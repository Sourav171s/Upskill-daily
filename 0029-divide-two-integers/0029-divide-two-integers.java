class Solution {
    public int divide(int dividend, int divisor) {
        long divident = dividend;
        long divis = divisor;
        long qo = 0;
        int a = 1;
        int b = 1;
        if (divident < 0) {
            a = -1;
        }
        if (divis < 0) {
            b = -1;
        }
        if (divis == 1 || divis == -1) {
            long y = divis * divident;
            if (y > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (y < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int) y;
            }
        }
        divident = Math.abs(divident);
        divis = Math.abs(divis);

        long remainder = 0;
        boolean flag = true;
        int x = 0;
        while (divident >= divis) {
            flag = true;
            if ((divis << x) > divident) {
                long chunk = divis << (x - 1); // current biggest usable multiple
                long addQ = 1L << (x - 1); // corresponding quotient chunk

                qo += addQ; // sirf current chunk add karo
                divident -= chunk; // sirf current chunk subtract karo
                x = 0;
                flag=false;
            }
            if (flag == false) {
                continue;
            }
            x++;
        }

        qo = qo * a * b;
        if (qo > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (qo < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) qo;
        }

    }
}