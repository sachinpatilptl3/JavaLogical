package edu.matrix;

public class ColumnReverse 
{
	public static void main(String[] args) {
		int[][] a={{1,2,3},
				   {4,5,6},
				   {7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			int k=a.length-1;
			for(int j=0;j<k;j++,k--)
			{
				int temp=a[j][i];
				a[j][i]=a[k][i];
				a[k][i]=temp;
			}
		}
		display(a);
	}
	static void display(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	}
}
