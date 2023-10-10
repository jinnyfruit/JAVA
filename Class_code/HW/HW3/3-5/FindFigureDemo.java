/*
 file name: 3-5
 author: Ji woo Kim
 modified: 05.24
*/
public class FindFigureDemo {
    public static void main(String[] args)
    {
       FindFigure table = new FindFigure();
       double output[][] = new double[4][5];

        table.table[0][0] = 1.2;
        table.table[0][1] = 1.3;
        table.table[0][2] = 4.5;
        table.table[0][3] = 6.2;
        table.table[0][4] = 2.7;
        table.table[1][0] = 1.7;
        table.table[1][1] = 3.3;
        table.table[1][2] = 4.4;
        table.table[1][3] = 10.5;
        table.table[1][4] = 17.0;
        table.table[2][0] = 1.1;
        table.table[2][1] = 4.5;
        table.table[2][2] = 2.1;
        table.table[2][3] = 25.3;
        table.table[2][4] = 9.2;
        table.table[3][0] = 1.0;
        table.table[3][1] = 9.5;
        table.table[3][2] = 8.3;
        table.table[3][3] = 2.9;
        table.table[3][4] = 2.1;

        int i=0,j=0;

        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                table.sum +=table.table[i][j];
            }
        }
        table.average = table.sum / 20;
        System.out.println("average :" + table.average);
        table.threshold = 1.4;
        System.out.println("result of threshold: 1.4 ");
       double standard = table.average*table.threshold;

        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                if(table.table[i][j]>standard){
                    output[i][j] = 1.1;
                }
                else if (table.table[i][j]<=standard)
                    output[i][j] = 0.0;
            }
        }

        System.out.println("standard: "+standard);
        System.out.println();

        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.printf("%.2f\t",output[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        table.threshold = 0.6;

        System.out.println("result of threshold: 0.6");
        standard = table.average*table.threshold;

        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                if(table.table[i][j]>standard){
                    output[i][j] = 1.0;
                }
                else if (table.table[i][j]<=standard)
                    output[i][j] = 0.0;
            }
        }

        System.out.println("standard: "+standard);
        System.out.println();
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.printf("%.2f\t",output[i][j]);
            }
            System.out.println();
        }


    }
}