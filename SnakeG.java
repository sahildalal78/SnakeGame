import java.util.*;

public class SnakeG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int length = 30;
		int width = 30;
         char prev='v';
		int score = 0;
		int i, j;
		char in;
		ArrayList<Integer> snakei = new ArrayList<Integer>();
		ArrayList<Integer> snakej = new ArrayList<Integer>();
		snakei.add(1);
		snakej.add(1);
		int indexoffoodi = 1;
		int indexoffoodj = 5;

		
		
		for (i = 0; i < width; i++) {
			if (i == 0) {
				for (j = 0; j < length; j++) {
					System.out.print("_");
				}

			} else if (i == width - 1) {
				for (j = 0; j < length; j++) {
					System.out.print("-");
				}

			} else {
				for (j = 0; j < length; j++) {
					if (j == 0 || j == length - 1) {
						System.out.print("|");
					} else if (i == indexoffoodi && j == indexoffoodj) {
						System.out.print("*");
					} else if (snakei.contains(i) && snakej.contains(j)) {
						System.out.print("O");
					} else {
						System.out.print(" ");
					}

				}
			}

			System.out.println();
		}
		while (true) {
			in = scn.nextLine().charAt(0);
			if (in == 'w') {
				if(prev=='s') {
					snakei.add(0, snakei.get(0)+1);
					snakej.add(0, snakej.get(0));
					snakei.remove(snakei.size() - 1);
					snakej.remove(snakej.size() - 1);
					prev='s';
					
				}else {
					snakei.add(0, snakei.get(0)-1);
					snakej.add(0, snakej.get(0) );
					snakei.remove(snakei.size() - 1);
					snakej.remove(snakej.size() - 1);
					prev='w';
				}
				
				if (snakei.get(0) == width - 1 ||snakei.get(0) == 0 ||snakej.get(0) == 0 || snakej.get(0) == length - 1) {
					System.out.println("gameover");
					System.out.println("yourscore "+score);
					break;
				}
				if (snakei.get(0) == indexoffoodi && snakej.get(0) == indexoffoodj) {
					snakei.add(0, indexoffoodi);
					snakej.add(0, indexoffoodj);
					score++;

					indexoffoodi = getRandomDoubleBetweenRange(0, width - 1);
					indexoffoodj = getRandomDoubleBetweenRange(0, length - 1);
					while(snakei.contains(indexoffoodi)&&snakej.contains(indexoffoodj)) {
						indexoffoodi = getRandomDoubleBetweenRange(0, width - 1);
					    indexoffoodj = getRandomDoubleBetweenRange(0, length - 1);
					    if(snakei.contains(indexoffoodi)&&snakej.contains(indexoffoodj)) {
					    	continue;
					    }
					    
					}

				}
				for (i = 0; i < width; i++) {

					if (i == 0) {
						for (j = 0; j < length; j++) {
							System.out.print("_");
						}
						System.out.println();

					} else if (i == width - 1) {
						for (j = 0; j < length; j++) {
							System.out.print("-");
						}
						System.out.println();

					} else {
						for (j = 0; j < length; j++) {
							if (j == 0 || j == length - 1) {
								System.out.print("|");
							} else if (i == indexoffoodi && j == indexoffoodj) {
								System.out.print("*");
							} else if (snakei.contains(i) && snakej.contains(j)) {
								System.out.print("O");
							} else {
								System.out.print(" ");
							}

						}
						System.out.println();
					}


				}
				

			} else if (in == 's') {
				if(prev=='w') {
					snakei.add(0, snakei.get(0)-1);
					snakej.add(0, snakej.get(0));
					snakei.remove(snakei.size() - 1);
					snakej.remove(snakej.size() - 1);
					prev='w';
					
				}else {
					snakei.add(0, snakei.get(0)+1);
					snakej.add(0, snakej.get(0) );
					snakei.remove(snakei.size() - 1);
					snakej.remove(snakej.size() - 1);
					prev='s';
				}
				
				if (snakei.get(0) == width - 1 ||snakei.get(0) == 0 ||snakej.get(0) == 0 || snakej.get(0) == length - 1) {
					System.out.println("gameover");
					System.out.println("yourscore "+score);
					break;
				}
				if (snakei.get(0) == indexoffoodi && snakej.get(0) == indexoffoodj) {
					snakei.add(0, indexoffoodi);
					snakej.add(0, indexoffoodj);
					score++;

					indexoffoodi = getRandomDoubleBetweenRange(0, length - 1);
					indexoffoodj = getRandomDoubleBetweenRange(0, width - 1);
					while(snakei.contains(indexoffoodi)&&snakej.contains(indexoffoodj)) {
						indexoffoodi = getRandomDoubleBetweenRange(0, width - 1);
					    indexoffoodj = getRandomDoubleBetweenRange(0, length - 1);
					    if(snakei.contains(indexoffoodi)&&snakej.contains(indexoffoodj)) {
					    	continue;
					    }
					    
					}

				}

				for (i = 0; i < width; i++) {
					if (i == 0) {
						for (j = 0; j < length; j++) {
							System.out.print("_");
						}
						System.out.println();

					} else if (i == width - 1) {
						for (j = 0; j < length; j++) {
							System.out.print("-");
						}
						System.out.println();

					} else {
						for (j = 0; j < length; j++) {
							if (j == 0 || j == length - 1) {
								System.out.print("|");
							} else if (snakei.contains(i) && snakej.contains(j)) {
								System.out.print("O");
							}

							else if (i == indexoffoodi && j == indexoffoodj) {
								System.out.print("*");
							}

							else {
								System.out.print(" ");
							}

						}
						System.out.println();
					}

				}
				
          
			} else if (in == 'a') {
				
				if(prev=='d') {
					snakei.add(0, snakei.get(0));
					snakej.add(0, snakej.get(0) + 1);
					snakei.remove(snakei.size() - 1);
					snakej.remove(snakej.size() - 1);
					prev='d';
					
				}else {
					snakei.add(0, snakei.get(0));
					snakej.add(0, snakej.get(0) - 1);
					snakei.remove(snakei.size() - 1);
					snakej.remove(snakej.size() - 1);
					prev='a';
				}
				if (snakei.get(0) == width - 1 ||snakei.get(0) == 0 ||snakej.get(0) == 0 || snakej.get(0) == length - 1) {
					System.out.println("gameover");
					System.out.println("yourscore "+score);
					break;
				}
				if (snakei.get(0) == indexoffoodi && snakej.get(0) == indexoffoodj) {
					snakei.add(0, indexoffoodi);
					snakej.add(0, indexoffoodj);
					score++;

					indexoffoodi = getRandomDoubleBetweenRange(0, length - 1);
					indexoffoodj = getRandomDoubleBetweenRange(0, width - 1);
					while(snakei.contains(indexoffoodi)&&snakej.contains(indexoffoodj)) {
						indexoffoodi = getRandomDoubleBetweenRange(0, width - 1);
					    indexoffoodj = getRandomDoubleBetweenRange(0, length - 1);
					    if(snakei.contains(indexoffoodi)&&snakej.contains(indexoffoodj)) {
					    	continue;
					    }
					    
					}

				}

				for (i = 0; i < width; i++) {
					if (i == 0) {
						for (j = 0; j < length; j++) {
							System.out.print("_");
						}
						System.out.println();

					} else if (i == width - 1) {
						for (j = 0; j < length; j++) {
							System.out.print("-");
						}
						System.out.println();

					} else {
						for (j = 0; j < length; j++) {
							if (j == 0 || j == length - 1) {
								System.out.print("|");
							} else if (snakei.contains(i) && snakej.contains(j)) {
								System.out.print("O");
							}

							else if (i == indexoffoodi && j == indexoffoodj) {
								System.out.print("*");
							} 

							else {
								System.out.print(" ");
							}

						}
						System.out.println();
					}

				}

              
			} else if (in == 'd') {

				if(prev=='a') {
					snakei.add(0, snakei.get(0));
					snakej.add(0, snakej.get(0) - 1);
					snakei.remove(snakei.size() - 1);
					snakej.remove(snakej.size() - 1);
					prev='a';
					
				}
				else {
					snakei.add(0, snakei.get(0));
					snakej.add(0, snakej.get(0) + 1);
					snakei.remove(snakei.size() - 1);
					snakej.remove(snakej.size() - 1);
					prev='d';
				}
				
				
				
				if (snakei.get(0) == width - 1 ||snakei.get(0) == 0 ||snakej.get(0) == 0 || snakej.get(0) == length - 1) {
					System.out.println("gameover");
					System.out.println("yourscore "+score);
					break;
				}
				if (snakei.get(0) == indexoffoodi && snakej.get(0) == indexoffoodj) {
					snakei.add(0, indexoffoodi);
					snakej.add(0, indexoffoodj);
                     score++;
					indexoffoodi = getRandomDoubleBetweenRange(0, length - 1);
					indexoffoodj = getRandomDoubleBetweenRange(0, width - 1);
					while(snakei.contains(indexoffoodi)&&snakej.contains(indexoffoodj)) {
						indexoffoodi = getRandomDoubleBetweenRange(0, width - 1);
					    indexoffoodj = getRandomDoubleBetweenRange(0, length - 1);
					    if(snakei.contains(indexoffoodi)&&snakej.contains(indexoffoodj)) {
					    	continue;
					    }
					    
					}



				}

				for (i = 0; i < width; i++) {
					if (i == 0) {
						for (j = 0; j < length; j++) {
							System.out.print("_");
						}
						System.out.println();

					} else if (i == width - 1) {
						for (j = 0; j < length; j++) {
							System.out.print("-");
						}
						System.out.println();

					} else {
						for (j = 0; j < length; j++) {
							if (j == 0 || j == length - 1) {
								System.out.print("|");
							} else if (snakei.contains(i) && snakej.contains(j)) {
								System.out.print("O");
							}

							else if (i == indexoffoodi && j == indexoffoodj) {
                                  
								System.out.print("*");
							} 

							else {
								System.out.print(" ");
							}

						}
						System.out.println();
					}

				}
				

			} else {
				System.out.print("invalid");
			}

		}
		

	}

	public static int getRandomDoubleBetweenRange(int min, int max) {
		int x = (int) ((Math.random() * ((max - min) + 1)) + min);
		return x;
	}

}
