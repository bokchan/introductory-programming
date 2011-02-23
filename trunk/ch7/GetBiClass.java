package ch7;

//Program to calculate the Binomial Coefficient
//By www.neiljohan.com

import java.io.IOException;

public class GetBiClass
{
	private static boolean debugging = true;

	/** @param tN & tK the values for working out the BinomialCoefficient
	 *  precondition tK>tN
	 *  @return Coef so that Coef>=1 or Coef=undefined */

    public static double GetBiCoefficient(double tN, double tK) throws IOException
        {

	/* check pre-condition */
	if (debugging && (tN<tK)){
		//System.out.println("Pre-condition violoated");
	};

	    double Coef=0;
            double tNumber=tN-1;

            for (double counter=0; counter<tK-1; counter++)
            {
                tN=tN*tNumber;
                tNumber--;
            }

            for (double count=tK; count>1; count--)
            {
                tK=tK*(count-1);
            }

            if (tK==0){
                Coef = 1;
            }
            else{
                Coef = tN/tK;
                
            }


	/* check post-condition */
	if (debugging && (Coef<0)){
		//System.out.println("Post-condition violoated");
	};	

	return Coef;


        }
}

