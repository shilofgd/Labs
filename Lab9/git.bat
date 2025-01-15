git init
git add .
git commit -m "Added 1"
git add .
git commit -m "Added 2"
git add .
git commit -m "Added 3"
git remote add lab9 https://github.com/shilofgd/Lab9.git
git push -u lab9 main
git branch branch1
git checkout branch1
git add .
git commit -m "Added 11"
git add .
git commit -m "Added 22"
git push -u lab9 branch1
git checkout main
git branch branch2
git checkout branch2
git add .
git commit -m "Added 111"
git add .
git commit -m "Added 222"
git push -u lab9 branch2
git checkout main
git merge branch1
git checkout branch2
git rebase main
git add .
git rebase --continue
git add .
git rebase --continue
git checkout main
git merge branch2
git push -u lab9 main