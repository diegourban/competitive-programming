package urban.uri_online_judge.beginner._2165;

import org.junit.Test;
import urban.common.SampleBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Main());
    }

    @Test
    public void shouldHandleTweets() throws IOException {
        String[] inputs = {
                "a"
                , "ags1r2dtcufiaa4htxnr4w4zcaoao 4 3v2jg1w56ldjxbsur9wsq1yid0rnp z rjszmg86s9m5hhhepoc0x5l0u6qiciw44lh8sxy9d5ocrx1sl9sumdo58j8k7t8rdnc10gjd2fn4"
        };

        for (int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append("a").buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("TWEET").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleMutes() throws IOException {
        String[] inputs = {
                "ags1r2dtcufiaa4htxnr4w4zcaoao 4 3v2jg1w56ldjxbsur9wsq1yid0rnp z rjszmg86s9m5hhhepoc0x5l0u6qiciw44lh8sxy9d5ocrx1sl9sumdo58j8k7t8rdnc10gjd2fn4v"
                , "ux2fs7 m995j 09071c54cr1c8sh861rdw4oog1fcr4im63k6fqwefnbd0epw7g9gjhj6wxz5nm1zmjpu3vz35 463pq8f7vqjc3 514l1n5hf0w7i1sxloh33bj25u5uwuxjybxhvqr19usqv16r4dcqcnc0r dzepbrl67ux0p08y459g631t 97oub 6bohi1olc9gt9wju6wv4 8knzkwog0wvq2fv3vshp07u1xcueb1t84dqq1qofjs5egix3514bizz lpjq71vovgh1e0qj16f8qw4fo3efxd9tpulqtl05285eg3wsuxw6smvb5944t5orklf91neipd6m1xrjo8xpv76of5nfe052d65bu0 941051m71himlg4i8upqxextworbju 9431y06br69j4wjv7qhfoqw815qlyf4rwbcj1yb18qr4hjsly4l4orpc6hs2weo084vrnrlmlv01qhu2m6gt0wtsx3q2pxz55ob"
        };

        for (int i = 0; i < inputs.length; i++) {
            InputStream input = new SampleBuilder().append(inputs[i]).buildAsInputStream();
            String output = Main.main(input);
            String expectedOutput = new SampleBuilder().appendln("MUTE").build();
            assertEquals(expectedOutput, output);
        }
    }

    @Test
    public void shouldHandleURISample() throws IOException {
        InputStream input = new SampleBuilder().append("RT @TheEllenShow: If only Bradley's arm was longer. Best photo ever. #oscars pic.twitter.com/C9U5NOtGap").buildAsInputStream();
        String output = Main.main(input);
        String expectedOutput = new SampleBuilder().appendln("TWEET").build();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldRunThroughMain() throws IOException {
        InputStream input = new SampleBuilder().append("RT @TheEllenShow: If only Bradley's arm was longer. Best photo ever. #oscars pic.twitter.com/C9U5NOtGap").buildAsInputStream();
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = new SampleBuilder().appendln("TWEET").build();
        assertEquals(expectedOutput, outContent.toString());
    }

}
