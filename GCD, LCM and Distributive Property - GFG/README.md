# GCD, LCM and Distributive Property
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given three integers <strong>x, y, z</strong>, the task is to compute the value of&nbsp;<strong>GCD(LCM(x,y), LCM(x,z)) </strong>and return the value.<br>
Where, GCD&nbsp;= Greatest Common Divisor, LCM&nbsp;= Least Common Multiple.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>x = 15, y = 20, z = 100
<strong>Output:</strong> 60
<strong>Explanation</strong>: GCD(LCM(15,20), LCM(15,100))
=GCD(60,300)=60.</span></pre>

<p><span style="font-size:18px">â€‹<strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: x = 30, y = 40, z = 400
<strong>Output:</strong> 120
<strong>Explanation</strong>: GCD(LCM(30,40), LCM(30,400))
=GCD(120,1200)=120.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findValue()</strong>&nbsp;which takes&nbsp;<strong>x, y, z&nbsp;</strong>as inputs and returns the answer.<br>
<br>
<strong>Expected Time Complexity:</strong>&nbsp;O(max(log x, log y, log z))<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)<br>
<br>
<strong>Constraints:</strong><br>
1 ≤ x, y, z ≤ 10<sup>6</sup></span></p>
</div>