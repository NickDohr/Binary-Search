
public class BinarySearch
	{
		public static void main(String[] args)
			{
				int [] Fred = {1,3,4,5,6,7,8,11,13,14,16,17};
				System.out.println(binarySearch(Fred, 11));
				
			}
		public static int binarySearch(int[] elements, int target)
		{
			int left = 0;
			int right = elements.length - 1;
			while(left <= right)
				{
					int mid = (left+ right)/2;
					if(target == elements[mid])
						{
							return mid;
						}
					else if(target < elements[mid])
						{
							right = mid - 1;
						}
					else
						{
							left = mid + 1;
						}
				}
			return - 1;
			
		}
	}
