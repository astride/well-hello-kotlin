# well-hello-kotlin
A project I'm using to start learning about [Kotlin](https://kotlinlang.org/).

In the beginning, I plan on solving simple Kotlin exercises found on [Exercism](https://exercism.org/) and [Kotlin Koans](https://play.kotlinlang.org/koans/overview).

I am coming from C#, and aim to populate my _Kotlin from C#_ cheat sheet below as I advance through the exercises.

# Kotlin from C# – Cheat sheet

## General

### Function/Method

#### Signature structure

> Kotlin
<pre>
fun <b>functionName</b>(<kbd><b>inputName</b></kbd>: <kbd><ins>InputType</ins></kbd>): <kbd><i>ReturnType</i></kbd> {
  ...
}
</pre>

> C#
<pre>
<kbd><i>ReturnType</i></kbd> <b>MethodName</b>(<kbd><ins>InputType</ins></kbd> <kbd><b>inputName</b></kbd>)
{
  ...
}
</pre>

Example:

> Kotlin
<pre>
fun <b>equalsOne</b>(<kbd><b>number</b></kbd>: <kbd><ins>Int</ins></kbd>): <kbd><i>Boolean</i></kbd> {
  return number == 1
}
</pre>

> C#
<pre>
<kbd><i>bool</i></kbd> <b>EqualsOne</b>(<kbd><ins>int</ins></kbd> <kbd><b>number</b></kbd>)
{
  return number == 1;
}
</pre>

When a method does not return anything, <kbd><i>ReturnType</i></kbd> is omitted in Kotlin:

> Kotlin
<pre>
fun <b>doNothing</b>() { }
</pre>

> C#
<pre>
<kbd><i>void</i></kbd> <b>DoNothing</b>() { }
</pre>
