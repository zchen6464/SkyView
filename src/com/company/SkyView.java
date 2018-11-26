package com.company;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows,int numCols, double[] scanned)
    {
        int y = 0;
        int cur = 0;
        view = new double[numRows][numCols];
        while(cur < scanned.length)
        {
            if(y % 2 == 1)
            {
                for(int x = 0; x < numCols; x++)
                {
                    view[y][x] = scanned[cur];
                    cur++;
                }
            }
            else {
                for(int x = numCols-1; x >= 0; x--)
                {
                    view[y][x] = scanned[cur];
                    cur++;
                }
            }
            y++;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        int sum = 0;
        int num = 0;
        for(int i = startRow; i <= endRow; i++)
        {
            for(int j = startCol; j <= endCol; j++)
            {
                sum += view[i][j];
                num++;
            }
        }
        return (double)sum/num;
    }
}
