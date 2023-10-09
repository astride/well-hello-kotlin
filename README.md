# well-hello-kotlin
A project I'm using to start learning about [Kotlin](https://kotlinlang.org/).

In the beginning, I plan on solving simple Kotlin exercises found on [Exercism](https://exercism.org/) and [Kotlin Koans](https://play.kotlinlang.org/koans/overview).

I am coming from C#, and aim to populate my _Kotlin from C#_ cheat sheet below as I advance through the exercises.

# Kotlin from C# – Cheat sheet

## General

### Function / Method

#### Structure

> Kotlin
<pre>
  fun <b>functionName</b>(<b>inputParameterName</b>: <b>InputParameterType</b>): <b>ReturnType</b> {
    // Logic
  }
</pre>

> C#
<pre>
  <b>ReturnType</b> <b>MethodName</b>(<b>InputParameterType</b> <b>inputParameterName</b>)
  {
    // Logic;
  }
</pre>

Example:

> Kotlin
<pre>
  fun equalsOne(number: Int): Boolean {
    return number == 1
  }
</pre>

> C#
<pre>
  bool EqualsOne(int number)
  {
    return number == 1;
  }
</pre>

When a method does not return anything, `ReturnType` is omitted in Kotlin:

> Kotlin
<pre>
  fun doNothing() { }
</pre>
> C#
<pre>
  <b>void</b> DoNothing() { }
</pre>
