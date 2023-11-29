# well-hello-kotlin
A project I'm using to start learning about [Kotlin](https://kotlinlang.org/).

In the beginning, I plan on solving simple Kotlin exercises found on [Exercism](https://exercism.org/) and [Kotlin Koans](https://play.kotlinlang.org/koans/overview).

I am coming from C#, and aim to populate my _Kotlin from C#_ cheat sheet below as I advance through the exercises.

# Kotlin from C# – Cheat sheet

## General

### Function/Method

#### Signature structure

<blockquote>
Kotlin

```
fun functionName(inputName: InputType): ReturnType {
  ...
}
```
</blockquote>

<blockquote>
C#

```
ReturnType MethodName(InputType inputName)
{
  ...
}
```
</blockquote>

#### Example

<blockquote>
Kotlin

```
fun equalsOne(number: Int): Boolean {
  return number == 1
}
```
</blockquote>

<blockquote>
C#

```
bool EqualsOne(int number)
{
  return number == 1;
}
```
</blockquote>

When a function/method does not return anything, `ReturnType` is omitted in Kotlin:

<blockquote>
Kotlin

```
fun doNothing() { }
```
</blockquote>

<blockquote>
C#

```
void DoNothing() { }
```
</blockquote>
