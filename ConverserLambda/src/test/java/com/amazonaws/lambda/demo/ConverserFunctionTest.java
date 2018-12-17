package com.amazonaws.lambda.demo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class ConverserFunctionTest {

    private static Object input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = "500";
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("ConverserFunction");

        return ctx;
    }

    @Test
    public void testConverserFunction() {
        ConverserFunction handler = new ConverserFunction();
        Context ctx = createContext();

        String output = handler.handleRequest(input, ctx);
        ctx.getLogger().log("Output: " + output);
        // TODO: validate output here if needed.
        Assert.assertEquals("Hello from Lambda!", output);
    }
}
