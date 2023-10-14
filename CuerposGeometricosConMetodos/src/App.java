import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int respuesta = 0;
        int contador = 0;
        double a, apiramide;
        double al, at, v, radio;
        double pbase, abase, apotema;
        double longitudlados, altura;
        double abaseM, pbaseM, r, rm;
        do {
            System.out.println("Indique con que figura geometrica desea trabajar");
            System.out.println("1. prisma");
            System.out.println("2.Cilindro");
            System.out.println("3.Piramide");
            System.out.println("4.Cono");
            System.out.println("5.Esfera");
            System.out.println("6.Zona esferica");
            System.out.println("7.Casquete esferico");
            System.out.println("8.Huso esferico y cuña esferica");
            System.out.println("9.Ortoedro");
            System.out.println("10.Tetraedro");
            System.out.println("11.Hexaedro");
            System.out.println("12.Octaedro");
            System.out.println("13.Dodecaedro");
            System.out.println("14.Icosaedro");
            System.out.println("15.Tronco de cono");
            System.out.println("16.Tronco de piramide");
            respuesta = entrada.nextInt();
            contador++;
        } while (respuesta > 12 || respuesta < 0 && contador < 3);

        switch (respuesta) {

            case 1 -> {
                System.out.println("PRISMA");
                int clados;

                System.out.println("Ingrese la cantidad de lados: ");
                clados = entrada.nextInt();

                System.out.println("Ingrese la longitud de los lados");
                longitudlados = entrada.nextDouble();

                System.out.println("Ingrese la altura");
                altura = entrada.nextDouble();

                al = alPrisma(clados, longitudlados, altura);

                System.out.println("Area lateral: " + al);

                at = atPrisma(longitudlados, clados, altura);

                System.out.println("Area total: " + at);

                v = vPrisma(altura, clados, longitudlados);

                System.out.println("Volumen: " + v);

            }

            case 2 -> {
                System.out.println("CILINDRO");

                double p, h;

                // Area lateral del cilindro

                System.out.println("Ingrese el radio del cilindro: ");
                r = entrada.nextDouble();

                System.out.println("Ingrese la altura del cilindro: ");
                h = entrada.nextDouble();

                al = alCilindro(r, h);

                System.out.println("Area lateral : " + al);

                // Area total del cilindro
                at = atCilindro(r, h);
                System.out.println("Area total : " + at);

                // Volumen del cilindro
                v = vCilindro(h,r);
                System.out.println("Volumen : " + v);

            }

            case 3 -> {
                System.out.println("PIRAMIDE");

                double anchl;

                System.out.println("Ingrese la altura: ");
                altura = entrada.nextDouble();

                System.out.println("Ingrese la longitud de los lados");
                longitudlados = entrada.nextDouble();

                System.out.println("Ingrese la anchura de los lados");
                anchl = entrada.nextDouble();

                al = alPiramide(altura, anchl, longitudlados);

                System.out.println("Area lateral: " + al);

                at = atPiramide(longitudlados, altura, anchl);
                System.out.println("Area total" + at);

                v=vPiramide(longitudlados, altura);
                System.out.println("Volumen: " + v);

            }

            case 4 -> {
                System.out.println("CONO");

                double g, h;

                System.out.println("Ingrese el radio del cono : ");
                r = entrada.nextDouble();

                System.out.println("Ingrese la generatriz del cono: ");
                g = entrada.nextDouble();

                System.out.println("Ingrese la altura del cono: ");
                h = entrada.nextDouble();

                // Area lateral del cono
                al = alCono(r, g);
                System.out.println("Area lateral del cono: " + al);
                // Area total del cono
                at = atCono(r, g);
                System.out.println("Area total del cono: " + at);

                // Volumen
                v = vCono(h, r);
                System.out.println("Volumen del cono: " + v);

            }

            case 5 -> {
                System.out.println("ESFERA");

                System.out.println("Ingrese el radio");
                radio = entrada.nextDouble();
                a = aEsfera(radio);
                System.out.println("Area de la esfera: " + a);
                v = vEsfera(radio);
                System.out.println("Volumen de la esfera: " + v);

            }

            case 6 -> {
                System.out.println("ZONA ESFERICA");

                System.out.println("Ingrese la altura");
                altura = entrada.nextDouble();

                System.out.println("Ingrese el radio");
                r = entrada.nextDouble();

                System.out.println("Ingrese el radio mayor");
                rm = entrada.nextDouble();

                a = aZEsferica(rm, altura);

                System.out.println("Area: " + a);
                v = vZEsferica(r, rm, altura);
                System.out.println("Volumen: " + v);

            }

            case 7 -> {
                System.out.println("CASQUETE ESFERICO");

                System.out.println("Ingrese el radio mayor de la esfera: ");
                rm = entrada.nextDouble();

                System.out.println("Ingrese la altura de la esfera: ");
                altura = entrada.nextDouble();

                // Area
                a = aCEsferico(rm, altura);
                System.out.println("Area: " + a);
                // Volumen
                v = vCEsferico(rm, altura);
                System.out.println("Volumen: " + v);

            }

            case 8 -> {
                System.out.println("HUSO ESFERICO Y CUÑA ESFERICA");

                double nGrados;

                System.out.println("Ingrese el radio: ");
                r = entrada.nextDouble();

                System.out.println("Ingrese el numero de grados: ");
                nGrados = entrada.nextDouble();

                // Area
                a =  aHEyCE(r, nGrados);
                System.out.println("Area: " + a);

                // Volumen
                v = vHEyCE(r);
                System.out.println("Volumen: " + v);

            }

            case 9 -> {
                System.out.println("ORTOEDRO");
                double aristas, base, diagonal;

                System.out.println("Ingrese la altura");
                altura = entrada.nextDouble();

                System.out.println("Ingrese la base:");
                base = entrada.nextDouble();

                System.out.println("Ingrese la arista:");
                aristas = entrada.nextDouble();

                a = aOrtoedro(aristas, base, altura);
                System.out.println("Area: " + a);

                diagonal = dOrtoedro(aristas, base, altura);
                System.out.println("Diagonal: " + diagonal);

                v = vOrtoedro(aristas, base, altura);
                System.out.println("Volumen: " + v);

            }

            case 10 -> {
                System.out.println("TETRAEDRO");

                double ar;

                System.out.println("aristas: ");
                ar = entrada.nextDouble();

                // Area(pendiente)
                a = aTetraedro(ar);
                System.out.println("Area: " + a);
                // Volumen(pendiente)
                v = vTetraedro(ar);
                System.out.println("Volumen: " + v);

            }

            case 11 -> {
                System.out.println("HEXAEDRO");

                double ar;

                System.out.println("Aristas: ");
                ar = entrada.nextDouble();

                // Area
                a = aHexaedro(ar);
                System.out.println("Area: " + a);

                // Volumen
                v = vHexaedro(ar);
                System.out.println("Volumen: " + v);

            }

            case 12 -> {
                System.out.println("OCTAEDRO");
                double ar;

                System.out.println("Aristas: ");
                ar = entrada.nextDouble();

                // Area
                a = aOctaedro(ar);
                System.out.println("Area: " + a);

                // Volumen
                v = vOctaedro(ar);
                System.out.println("Volumen: " + v);

            }

            case 13 -> {
                System.out.println("DODECAEDRO");

                double ar;

                System.out.println("Aristas: ");
                ar = entrada.nextDouble();

                // Area
                a = aDodecaedro(ar);
                System.out.println("Area: " + a);

                // Volumen
                v = vDodecaedro(ar);
                System.out.println("Volumen: " + v);

            }

            case 14 -> {
                System.out.println("ICOSAEDRO");
                double ar;

                System.out.println("Aristas: ");
                ar = entrada.nextDouble();

                // Area(pendiente)
                a = aIcosaedro(ar);
                System.out.println("Area: " + a);

                // Volumen(pendiente)
                v = vIcosaedro(ar);
                System.out.println("Volumen : " + v);

            }

            case 15 -> {
                System.out.println("TRONCO DE CONO");

                double g, h;

                System.out.println("Ingrese la altura: ");
                h = entrada.nextDouble();

                System.out.println("ingrese el radio mayor: ");
                rm = entrada.nextDouble();

                System.out.println("Ingrese el radio menor");
                r = entrada.nextDouble();

                System.out.println("Ingrese la generatriz: ");
                g = entrada.nextDouble();

                System.out.println("Area de la base mayor: ");
                abaseM = entrada.nextDouble();

                System.out.println("Area de la base menor");
                abase = entrada.nextDouble();

                // Area lateral
                al = alTroncoCono(g, r, rm);
                System.out.println("Area lateral: " + al);

                // Area total(pendiente)
                at = atTroncoCono(g, r, rm, abase, abaseM);
                System.out.println("Area total : " + at);

                // Volumen
                v = vTroncoCono(h, r, rm);
                System.out.println("Volumen : " + v);

            }

            case 16 -> {
                System.out.println("TRONCO DE PIRAMIDE");

                double longitudMayor, longitudMenor, longitudMayorMitad;

                System.out.println("Ingrese la longitud del lado mayor");
                longitudMayor = entrada.nextDouble();

                System.out.println("Ingrese la longitud del lado menor");
                longitudMenor = entrada.nextDouble();

                System.out.println("Ingrese la altura");
                altura = entrada.nextDouble();

                al = alTroncoPiramide(longitudMayor, longitudMenor, altura);
                System.out.println("Area lateral: " + al);

                at = atTroncoPiramide(longitudMayor, longitudMenor, altura);
                System.out.println("Area total: " + at);

                v = vTroncoPiramie(altura, longitudMayor, longitudMenor);
                System.out.println("Volumen: " + v);

            }
        }

        entrada.close();
    }

    public static double alPrisma(int clados, double longitudlados, double altura){
        double pbase = clados * longitudlados;
        double al = pbase * altura;

        return al;
    }


    public static double atPrisma(double longitudlados, int clados, double al){
        double alfa = (Math.PI / 180) * (380 / clados);
        double apotema = longitudlados / (2 * Math.tan((alfa) / 2));
        double pbase = clados * longitudlados;
        double abase = (pbase * apotema) / 2;
        double at = al + abase;
        return at;
    }

    public static double vPrisma(double altura, int clados,double longitudlados){
        double alfa = (Math.PI / 180) * (380 / clados);
        double apotema = longitudlados / (2 * Math.tan((alfa) / 2));
        double pbase = clados * longitudlados;
        double abase = (pbase * apotema) / 2;
        double v = abase + altura;
        return v;
    }

    public static double alCilindro(double r, double h){
        double p = 2 * Math.PI * r;
        double al = p * h;
        return al;
    }
    
    public static double atCilindro(double r, double h){
        double p = 2 * Math.PI * r;
        double at = p * (h + r);
        return at;
    }
    public static double vCilindro(double h,double r){
        double abase = Math.PI * Math.pow(r, 2);
        double v = abase * h;
        return v;
    }

    public static double alPiramide(double altura, double anchl, double longitudlados){
        double pbase = 2 * longitudlados + 2 * anchl;
        double apotema = longitudlados / 2;
        double apiramide = Math.sqrt(Math.pow(altura, 2)) + Math.pow(apotema, 2);
        double al = (pbase * apiramide) / 2;
        return al;
    }

    public static double atPiramide(double longitudlados,double altura, double anchl){
        double pbase = 2 * longitudlados + 2 * anchl;
        double apotema = longitudlados / 2;
        double apiramide = Math.sqrt(Math.pow(altura, 2)) + Math.pow(apotema, 2);
        double al = (pbase * apiramide) / 2;
        double at = al + pbase;
        return at;
    }
    public static double vPiramide(double longitudlados,double altura){
        double abase = longitudlados / 2;
        double v = (abase * altura) / 3;
        return v;
    }
    public static double alCono(double r, double g){
        double al = Math.PI * r * g;
        return al;
    }
    public static double atCono(double r, double g){
        double abase = Math.PI * Math.pow(r, 2);
        double al = Math.PI * r * g;
        double at = al + abase;
        return at;
    }
    public static double vCono(double h,double r){
        double abase = Math.PI * Math.pow(r, 2);
        double v = (abase * h) / 3;
        return v;
    }
    public static double aEsfera(double radio){
        double a = 4 * Math.PI * Math.pow(radio, 2);
        return a;
    }
    public static double vEsfera(double radio){
        double a = 4 * Math.PI * Math.pow(radio, 2);
        double v = (4 / 3) * Math.PI * Math.pow(a, 3);
        return v;
    }
    public static double aZEsferica(double rm, double altura){
        double a = 2 * Math.PI * rm * altura;
        return a;
    }
    public static double vZEsferica(double r, double rm, double altura){
        double v = (Math.PI * altura * (Math.pow(altura, 2) + 3 * Math.pow(r, 2) + 3 * Math.pow(rm, 2))) / 6;
        return v;
    }
    public static double aCEsferico(double rm, double altura){
        double a = 2 * Math.PI * rm * altura;
        return a;
    }
    public static double vCEsferico(double rm, double altura){
        double v = (Math.PI * Math.pow(altura, 2) * (3 * rm - altura)) / 3;
        return v;
    }
    public static double aHEyCE(double r, double nGrados){
        double a = (4 * Math.PI * Math.pow(r, 2) * nGrados) / 360;
        return a;
    }
    public static double vHEyCE(double r){
        double v = (4 / 3) * ((Math.PI * Math.pow(r, 3)) / 360);
        return v;
    }
    public static double aOrtoedro(double aristas,double base,double altura){
        double a = 2 * (aristas * base + aristas * altura + base * altura); 
        return a;  
    } 
    public static double dOrtoedro(double aristas, double base, double altura){
        double diagonal = Math.sqrt(Math.pow(aristas, 2) + Math.pow(base, 2) + Math.pow(altura, 2));
        return diagonal;
    }
    public static double vOrtoedro(double aristas, double base, double altura){
        double v = aristas * base * altura;
        return v;
    }

    public static double aTetraedro(double ar){
        double a = ar * Math.sqrt(3);
        return a;
    }
    public static double vTetraedro(double ar){
        double  v = (Math.sqrt(2 / 12)) * Math.pow(ar, 3);
        return v;
    }
    public static double aHexaedro(double ar){
        double a = 6 * Math.pow(ar, 2);
        return a;
    }
    public static double vHexaedro(double ar){
        double v = Math.pow(ar, 3);
        return v;
    }
    public static double aOctaedro(double ar){
        double a = 2 * Math.pow(ar, 2) * (Math.sqrt(3));
        return a;
    }
    public static double vOctaedro(double ar){
        double v = Math.pow(ar, 3) * (Math.sqrt(2 / 3));
        return v;
    }
    public static double aDodecaedro(double ar){
        double a = 3 * Math.pow(ar, 3) * (Math.sqrt(25 + 10) * Math.sqrt(5));
        return a;
    }
    public static double vDodecaedro(double ar){
        double v = (1 / 4) * (15 + 7 * Math.sqrt(5)) * Math.pow(ar, 3);
        return v;
    }
    public static double aIcosaedro(double ar){
        double a = 5 * Math.pow(ar, 2) * Math.sqrt(3);
        return a;
    }
    public static double vIcosaedro(double ar){
        double v = (5 / 12) * (3 + Math.sqrt(5)) * Math.pow(ar, 3);
        return v;
    }
    public static double alTroncoCono(double g , double r, double rm){
        double al = Math.PI * g * (rm + r);
        return al;
    }
    public static double atTroncoCono(double g, double r, double rm, double abase, double abaseM){
        double al = Math.PI * g * (rm + r);
        double at = al + abase + abaseM;
        return at;
    }
    public static double vTroncoCono(double h, double r, double rm){
        double v = (1 / 3) * Math.PI * h * (Math.pow(rm, 2) + Math.pow(r, 2) + rm * r);
        return v;
    }
    public static double alTroncoPiramide(double longitudMayor, double longitudMenor,double altura){
        double longitudMayorMitad = longitudMayor / 2;
        double apiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(longitudMayorMitad, 2));
        double pbaseM = longitudMayor * 4;
        double pbase = longitudMenor * 4;
        double al = ((pbaseM + pbase) / 2) * apiramide;
        return al;
    }
    public static double atTroncoPiramide(double longitudMayor, double longitudMenor,double altura){
        double abaseM = Math.pow(longitudMayor, 2);
        double abase = Math.pow(longitudMenor, 2);
        double longitudMayorMitad = longitudMayor / 2;
        double apiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(longitudMayorMitad, 2));
        double pbaseM = longitudMayor * 4;
        double pbase = longitudMenor * 4;
        double al = ((pbaseM + pbase) / 2) * apiramide;
        double at = al + abase + abaseM;
        return at;
    }
    public static double vTroncoPiramie(double altura, double longitudMayor, double longitudMenor){
        double pbaseM = longitudMayor * 4;
        double pbase = longitudMenor * 4;
        double abaseM = Math.pow(longitudMayor, 2);
        double abase = Math.pow(longitudMenor, 2);
        double v = ((1 / 3) * altura * (abaseM + abase + Math.sqrt(abase * abaseM)));
        return v;
    }
}
