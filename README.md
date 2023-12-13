## Resolve Conflicts when working with Protected Branches

This project is using gitflow git workflow as the branching strategy. The project is using a develop branch to merge feature branches into instead of merging them directly into main.
The develop branch is the only branch allowed to merge into the main branch. The main and develop branch both have protections requiring pull request before merging and these branch can
not be merged directly. The goal is to resolve a merge conflict that is preventing a branch from merging into develop.

&nbsp;  
#### You can fork and clone the project. Forking the project will allow you to practice without anyone else pushing code you are not expecting.  
* log into GitHub and navigate to [repository](https://github.com/wanderllama/loop_git)
* click on fork in the top right corner
* unselect the checkbox _Copy the master branch only_ 
* now you can clone the project and click [here](#Start) to start
![fork.png](.idea/pictures/fork.png)
&nbsp;  
#### ... Or, create your own project
If you want to create your own project to practice you can start a new project and follow these steps to enable git, create develop branch, share project on GitHub, and create branch protection rules (optional).  

* Enable vcs and select git using git tab in intellij (first option)  
* Share project on GitHub from git tab located under the GitHub section  
* Create develop branch -> _git checkout -b develop_
* 
* optional branch protections
  * Log into GitHub, navigate to repository and click on settings.
  * Click on branches in left nav. 
  * In pattern field type the name of default branch and select Require a pull request before merging checkbox 
  * Add protection rule for develop branch the same way as master.

&nbsp;
### Start
#### tester1 and tester2 are at the beginning of the sprint and are ready to create their automations

* they open their IDE and the first thing they do is they pull and update their local 
  * _git checkout master_ 
  * _git pull origin master_

* they create a new branch using the ticket number on jira 
  * git checkout develop 
  * git branch B2G2-098 
  * git branch B2G2-096

* they both checkout to their new branch and start working 
  * git checkout B2G2-098 
  * git checkout B2G2-098
  
* the previous two steps creating and checking out can be combined after checking out to develop
    * git checkout -b <branchName>
    * where branchName is the name of the branch (do not include the <>)  
&nbsp;
### Tester 1 steps
#### For this practice we will walk through tester1 first and create a pull request and merge their work then complete the tester2 steps

* Tester one creates a test case named Test01 in the test package makes changes to existing method by adding a single line comment above a method
  

* Tester one then begins to commit their work  
    * git add . or git add --all
  

* Tester one commits their work to their local repository
    * git commit -m "message"
  

_the previous two steps can be combined in one command using __git commit -a -m "message"___

* Tester one pushes their local repository to the remote repository
    * git push
  

* tester one will log into GitHub and create a pull request to merge their code into develop branch
then they will report to their test leads or code reviewers letting them know they created a PR

&nbsp;
### Tester 2 steps

* Tester 2 creates a test case in the same place as tester 1s test case and adds a single line comment above the same method as tester 1
    * git commit -a -m “tester2”
  

* Tester 2 then pushes their code to remote repository
  * git push
  

* tester two will log into GitHub and create a pull request to merge their code into develop branch and sees that there is a conflict that needs to be resolved.
  

* Tester two checks out the develop branch and pulls from the remote repository updating his local develop branch to match the remote develop branch. Now tester 2 will have access to the lines of code causing the conflict on their local develop branch
    * git checkout develop
    * git pull
  

* Tester 2 wants to use IntelliJ GUI to resolve the conflict. Tester 2 creates a temporary branch from develop since tester 2 can not merge directly with develop because of the branch protections. This new branch is an exact copy of develop and has the lines of code conflicting with tester 2s original branch.
  * git checkout -b resolveConflict
  * git checkout tester2
  * git merge resolveConflict
  

* tester 2 now can resolve the merge conflict using IntelliJ GUI. Tester 2 can now resolve the conflicts using IntelliJ GUI by navigating to commit panel located on left side (used for making commits and pushing). tester 2 resolves the merge conflicts. When tester2 clicks apply/save the changes are committed to tester 2s local repository
  * more [information](https://www.jetbrains.com/help/idea/resolve-conflicts.html) on resolving conflicts using IntelliJ GUI  
  

* Tester2 deletes the resolveConflict branch since it is not required anymore
  * git branch -D resolveConflict
  

* Since tester2 is still checked out to their original branch they can push their changes committed to their local repository to the remote repository and creates a pull request
    * git push
  



