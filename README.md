# archery-melon-score-problem
Get total score for archery melon game


*** X is used when spare point is 10 out of which in single arrow point is 10 then the other one in the spare 
is marked as "X"


PROBLEM STATEMENT 

In the game of archery there are 10 melons placed one after the other in a straight line. The Archer is
supposed to shoot an arrow right through the 10 melons. Rules of this game of archery are as follows

There are 10 chances given to each archer , in every chance archer has 2 arrows to shoot through all the
melons.

#Points
If the archer blasts through 3 melons with the first arrow, in the second attempt archer has a shot at the
remaining 7 melons.

If the archer manages to blast through 3 more the overall score for this chance would be scored at 6

If the archer manages to pierce through all remaining 7 melons the score would be 10 + whatever archer
scores in the next try

If the archer manages to pierce through all 10 melons with a single arrow (even if it is the second try i.e.
0 on first try) score is 10 + whatever archer scores in the next 2 tries

10th chance is slightly different , if the archer manages to score a perfect 10 with the first arrow ,
another shot will be available to the archer at 10 more melons and if a perfect 10 is scored again
another chance will be presented to the archer to shoot through 10 melons again.

If the archer manages to score 10 with the first 2 arrows , one more shot at 10 melons is presented to
the archer and whatever is scored there will be added to the overall score.

So given a scoresheet of an archer write a program to calculate the overall score , below are some
example scoresheets with expected results


Chance 1
1st arrow = 4
2nd arrow = 2
Chance 2
1st arrow = 3
2nd arrow = 4
Chance 3
1st arrow = 7
2nd arrow = 3
Chance 4
1st arrow = 10
2nd arrow = No need to shoot(arrow will be returned)
Chance 5
1st arrow = 6
2nd arrow = 0
Chance 6
1st arrow = 0
2nd arrow = 5
Chance 7
1st arrow = 9
2nd arrow = 0
Chance 8
1st arrow = 2
2nd arrow = 1
Chance 9
1st arrow = 5
2nd arrow = 2
Chance 10 (can have a maximum of 3 arrows)
1st arrow = 10

2nd arrow = 10
3rd arrow = 5

Archer 1 Score is 104

Chance 1
1st arrow = 4
2nd arrow = 6
Chance 2
1st arrow = 10
2nd arrow = No need to shoot(arrow will be returned)
Chance 3
1st arrow = 0
2nd arrow = 10
Chance 4
1st arrow = 3
2nd arrow = 4
Chance 5
1st arrow = 3
2nd arrow = 1
Chance 6
1st arrow = 0
2nd arrow = 5
Chance 7
1st arrow = 9
2nd arrow = 0
Chance 8
1st arrow = 2
2nd arrow = 1

Chance 9
1st arrow = 5
2nd arrow = 2
Chance 10 (can have a maximum of 3 arrows)
1st arrow = 3
2nd arrow = 2

Archer 2 score is 97
