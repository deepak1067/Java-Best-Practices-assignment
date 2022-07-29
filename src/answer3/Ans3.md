>>The final modifier for finalizing the implementations of classes, methods, and variables.The main purpose of using a class being declared as final is to prevent the class from being subclassed. If a class is marked as final then no class can inherit any feature from the final class.
        Example
        final class Super {
            private int data = 30;
        }
        public class Sub extends Super{
            public static void main(String args[]){
            }
        }