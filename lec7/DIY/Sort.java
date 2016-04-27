public class Sort {

	/** Returns input strings in sorted order. 
	  * Non-destructive. */
 public static int indexOfSmallest(String[] inputs,int k)
  { int minDex=k;
 
  for (int i=k;i<inputs.length;i++)
   {
     int cmp=inputs[i].compareTo(inputs[minDex]);
      if (cmp<0)
        minDex =i;
    }
   
 return minDex;

  }
  public static String[] sort(String[] inputs, int k)
 {
  if (k==inputs.length)
      {return inputs;}
  int minDex = indexOfSmallest(inputs,k);
 swap (inputs,k,minDex);

 return sort(inputs,k+1);

 }
 private static void swap(String[] input, int a, int b)
  {
 String temp= input[a];
 input[a]=input[b];
 input[b]=temp;



  }
	public static String[] sort(String[] inputs) {
         return sort(inputs,0); 




	}

	/** Prints out all strings in inputs. */
	public static void print(String[] inputs) {
	}

	/** Outputs the command line arguments 
	  * in alphabetical order. */
	public static void main(String[] args) {
		
	}
} 
