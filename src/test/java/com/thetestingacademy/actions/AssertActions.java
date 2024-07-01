package com.thetestingacademy.actions;

public class AssertActions {
    public void verifyResponse(String actual,String expected, String description){
        assertsEquals(actual,expected ,description);
    }
  public void VerifyResponse(int actual , int expected , int description){
        assertsEquals(actual, expected, description);
  }

    public void verifyResponse(float actual, float expected, float description){
        assertsEquals(actual, expected, description);
    }

    public void VerifyResponse(double actual, double expected, double description){
        assertsEquals(actual, expected, description);
    }

    public void verifyResponse(long actual, long expected, long description){
        assertsEquals(actual, expected, description);
    }
    public void verifyResponse(boolean actual, boolean expected, boolean description){
        assertsEquals(actual, expected, description);
    }

    public void verifyStatusCodeInvalidReq(Response response) {
        assertEquals(String.valueOf(response.getStatusCode()).startsWith("50"), true,
                "value of status code is" + response.getStatusCode());
    }

    public void verifyStatusCode(Response response,Integer expected) {
        assertEquals(response.getStatusCode(),expected);
    }

}
