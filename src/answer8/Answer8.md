
>>Yes, we can catch "Throwable" in java but its not a good practice.

>>There are several reasons why catching an instance of java.lang.Throwable is a bad idea because
  in order to catch them you have to declare at your method signature
  e.g.
  public void doSomething() throws Throwable.

>>When you do this, nobody knows what kind of Error this method is going to throw, and until you
  know what is the problem, how can you resolve that.

>>The main purpose of providing Exception handling mechanism is to handle error situation properly,
   but you can't a provide a solution which can solve all problems.

>>That's why we have specific Exception classes e.g. FileNotFoundException, IllegalArgumentException,
  IOException and so on. So if you don't know how to resolve or handle the error, there is no point
   catching Throwable, all it make your code hard to read and comprehend.

>>You need to be as specific as possible while catching exceptions[i.e FileNotFoundException,illegalArgumentException,IOException]

>>if you catch Throwable, use it as safety measure,not as your PRIMARY EXCEPTION handling code.
            
            Example:-
            public class Example {
                public static void main(String[] args) {
                    try{
                        throw new Throwable("Throwable");
                    } catch (Throwable throwable){
                        System.out.println("I Caught Throwable:" + (throwable.getMessage().equals("Throwable") ? "Expected" : "Unexpected"));
                    }
                }
            }

