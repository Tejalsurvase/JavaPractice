import java.util.Scanner ;
class MenuCardSwitch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("!...WELCOME...!") ;
		System.out.println("Please make choice..!") ;
		System.out.println("********************************************************") ;
		System.out.println("Enter ") ;
		System.out.println("1 for SNACKS") ;
		System.out.println("2 for STARTERS") ;
		System.out.println("3 for MAIN COURSE") ;
		System.out.println("4 for DESSERTS") ;
		int choice = sc.nextInt() ;
		switch (choice)
		{
		case 1:
			{
				System.out.println("Enter ") ;
		        System.out.println("1 for BEVERAGES") ;
		        System.out.println("2 for CHAAT") ;
		        int ch1 = sc.nextInt() ;
				switch (ch1)
				{
				case 1:
					{
						System.out.println(" # Lemon Iced Tea") ;
						break ;
					}
				case 2:
					{
						System.out.println("# Pani Puri") ;
						System.out.println("# Bhel Puri") ;
						System.out.println("# Dahi Sev Puri") ;
						System.out.println("# Dahi Bhalla") ;
						System.out.println("# Aloo Tikki(Agra Style)") ;
						break ;
					}
				default :
					{
						System.out.println("Choose Valid Option...!") ;
					}
				}
				break ;
			}
			
			case 2:
			{
				System.out.println("Enter ") ;
		        System.out.println("1 for SOUP") ;
		        System.out.println("2 for ACCOMPANIMENT") ;
		        int ch1 = sc.nextInt() ;
				switch (ch1)
				{
				case 1:
					{
						System.out.println("Enter ") ;
		                System.out.println("1 for VEG") ;
		                System.out.println("2 for NON-VEG") ;
		                int ch2 = sc.nextInt() ;
						switch (ch2)
						{
						case 1:
							{
								System.out.println("# Sweet Corn Soup") ;
								break ;
							}
						case 2:
							{
								System.out.println("# Chicken Hot N Sour") ;
								break ;
							}
						default :
					       {
						        System.out.println("Choose Valid Option...!") ;
					       }
						}
						break ;
					}

					case 2:
					{
						System.out.println("# Pasta Salad") ;
						System.out.println("# Russian Salad") ;
						System.out.println("# Finger Green Salad") ;
						System.out.println("# Roasted Papad") ;
						System.out.println("# Seasonal Fresh Fruits") ;
						System.out.println("# Aloo Mint Raita") ;
						break ;
					}
					default :
					{
						System.out.println("Choose Valid Option...!") ;
					}
				}
			}

			case 3:
			{
				System.out.println("1 for VEG") ;
		        System.out.println("2 for NON-VEG") ;
		        System.out.println("3 for BREADS") ;
				int ch1 = sc.nextInt() ;
				switch (ch1)
				{
				case 1:
					{
						System.out.println("# Pahadi Paneer Tikka") ;
						System.out.println("# Mushroom Achari Tikka") ;
						System.out.println("# Afghani Soya Chaap") ;
						System.out.println("# Harabhara Kebab") ;
						System.out.println("# Cheese Corn Cutlet") ;
						System.out.println("# Tandoori Pineapple") ;
						System.out.println("# Paneer Ka Zayka") ;
						System.out.println("# Veg. Kolhapuri") ;
						System.out.println("# Veg. Kofta") ;
						System.out.println("# Dal Makhani") ;
						System.out.println("# Vegetable Pulao") ;
						System.out.println("# Pink Souce Pasta") ;
						System.out.println("# Hong Kong Noodles") ;
						break ;
					}


				case 2:
					{
						System.out.println("# Patiala Tangdi Kebab") ;
						System.out.println("# Chicken Lasagna") ;
						System.out.println("# Railway Mutton Curry") ;
						System.out.println("# Mutton Tawe Wala") ;
						System.out.println("# Machhi Ajwaini Tikka") ;
						System.out.println("# Machhi Amritsari") ;
						System.out.println("# Hara Lasooni Jinga") ;
						System.out.println("# Railway Mutton Curry") ;
						System.out.println("# Macchi Nawabi") ;
						System.out.println("# Murga Dum Biryani") ;
						System.out.println("# Murga Hazarvi") ;
						System.out.println("# Bhatti Da Murga") ;
						System.out.println("# Murga Rogan Josh") ;
						break ;
					}

				case 3:
					{
						System.out.println("# Roti") ;
						System.out.println("# Naan") ;
						System.out.println("# Paratha") ;
						System.out.println("# Mirchi Naan") ;
						System.out.println("# Mirchi Paratha") ;
						System.out.println("# Garlic Naan") ;
						System.out.println("# Aloo Paratha") ;
						break ;
					}
				default :
					{
						System.out.println("Choose Valid Option...!") ;
					}
				}
				break ;
			}

			case 4:
			{
				System.out.println("1 for INDIAN SWEETS") ;
		        System.out.println("2 for DESSERTS") ;
		        System.out.println("3 for PASEELA PAAN") ;
				int ch1 = sc.nextInt() ;
				switch (ch1)
				{
				case 1:
					{
						System.out.println("# Gulab Jamun") ;
						System.out.println("# Moong Dal Ka Halwa") ;
						System.out.println("# Rasmalai") ;
						System.out.println("# Fruit Salad") ;
						System.out.println("# Colf Coco") ;
						break ;
					}

				case 2:
					{
						System.out.println("# Belgian Chocolate Pastry") ;
						System.out.println("# Chocolate Fountain") ;
						System.out.println("# With Cakes, Fruits!") ;
						System.out.println("# Chocolates Shots") ;
						System.out.println("# Vanilla Ice Cream") ;
						System.out.println("# Chocolate Ice Cream") ;
						System.out.println("# Strawberry Ice Cream") ;
						System.out.println("# Butterscotch Ice Cream") ;
						break ;
					}
				
				case 3:
					{
						System.out.println("# Meetha Pan") ;
						break ;
					}

				default :
					{
						System.out.println("Choose Valid Option...!") ;
					}
				}
				break ;
			}
		default :
			{
				System.out.println("Choose Valid Option...!") ;
			}
		}
	}
}
