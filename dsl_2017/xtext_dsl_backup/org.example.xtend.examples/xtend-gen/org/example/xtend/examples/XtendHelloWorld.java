package org.example.xtend.examples;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class XtendHelloWorld {
  public static void main(final String[] args) {
    InputOutput.<String>println("Hello World");
    final String test = StringExtensions.toFirstUpper("my string");
    final String same = StringExtensions.toFirstUpper("my string");
    InputOutput.<String>println(test);
    InputOutput.<String>println(same);
  }
}
