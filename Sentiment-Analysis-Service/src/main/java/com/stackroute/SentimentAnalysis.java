package com.stackroute;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;


import java.util.List;

public class SentimentAnalysis {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "The government on Thursday sought to ease fears in Assam as the deadline for the publication of the final National Register of Citizenship (NRC) approached, reiterating that those excluded will not automatically be declared foreigners and that people should not believe rumours\n" +
                "\n" +
                "The administration in Assam also increased security and issued orders banning large assemblies and use of loudspeakers in some areas regarded vulnerable to violence, including parts of the state capital Guwahati. ";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for(CoreSentence sentence : sentences) {

            String sentiment = sentence.sentiment();

            System.out.println(sentiment + "\t" + sentence);

        }
    }
}
