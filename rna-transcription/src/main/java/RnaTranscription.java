class RnaTranscription {

    String transcribe(String dnaStrand) {
        String output = "";
        for(int i=0;i<dnaStrand.length();i++)
            {
                if(dnaStrand.charAt(i)=='G')
                	output+="C";               
                else if(dnaStrand.charAt(i)=='C') 
                	output+="G";
                else if(dnaStrand.charAt(i)=='T') 
                	output+="A";
                else if (dnaStrand.charAt(i)=='A') 
                	output+="U";
                
            }
        return output;
    }

}
