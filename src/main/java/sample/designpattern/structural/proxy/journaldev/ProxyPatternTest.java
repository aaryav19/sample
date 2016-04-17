/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.designpattern.structural.proxy.journaldev;

/**
 * Proxy pattern intent is to “Provide a surrogate or placeholder for another object to control
 * access to it”. The definition itself is very clear and proxy pattern is used when we want to
 * provide controlled access of a functionality.
 *
 * Let’s say we have a class that can run some command on the system. Now if we are using it, its
 * fine but if we want to give this program to a client application, it can have severe issues
 * because client program can issue command to delete some system files or change some settings
 * that you don’t want. Check out Proxy Pattern post for the example program with implementation
 * details.
 *
 * Proxy pattern common uses are to control access or to provide a wrapper implementation for better
 * performance.So, we can perform many operations like hiding the information of original object,
 * on demand loading etc.
 * Proxy pattern is also known as Surrogate or Placeholder.
 * Java RMI whole package uses proxy pattern.
 *
 * @author kumar saurabh
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }

    }
}
