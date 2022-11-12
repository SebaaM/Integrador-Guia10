/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package IronMan;

/**
 *
 * @author SebaaM <sebaamartinez54@gmail.com>
 */
public class danioException extends Exception {

    /**
     * Creates a new instance of <code>danioException</code> without detail
     * message.
     */
    public danioException() {
    }

    /**
     * Constructs an instance of <code>danioException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public danioException(String msg) {
        super(msg);
    }
}
