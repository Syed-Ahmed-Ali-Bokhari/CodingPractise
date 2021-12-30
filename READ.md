if error like this come 

PROBLEM

Synavoss-MBP-5:CodingPractise ahmedbokhari$ git push -u origin master
git@github.com: Permission denied (publickey).
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
coding questions are placed

=====================

SOLUTION

if unable to push it on github 

create the SSH keys, type ssh-keygen -t rsa -C "your_email@example.com". This will create both id_rsa and id_rsa.pub files.

Add the id_rsa to ssh list on local computer: ssh-add ~/.ssh/id_rsa.

After generating the keys get the pubkey using :

cat ~/.ssh/id_rsa.pub 
you will get something like :

cat ~/.ssh/id_rsa.pub 

ssh-rsa AAAB3NzaC1yc2EAAAADAQABAAACAQCvMzmFEUPvaA1AFEBH6zGIF3N6pVE2SJv9V1MHgEwk4C7xovdk7Lr4LDoqEcqxgeJftwWQWWVrWWf7q9qCdHTAanH2Q5vx5nZjLB+B7saksehVOPWDR/MOSpVcr5bwIjf8dc8u5S8h24uBlguGkX+4lFJ+zwhiuwJlhykMvs5py1gD2hy+hvOs1Y17JPWhVVesGV3tlmtbfVolEiv9KShgkk3Hq56fyl+QmPzX1jya4TIC3k55FTzwRWBd+IpblbrGlrIBS6hvpHQpgUs47nSHLEHTn0Xmn6Q== user@email.com
copy this key (value) and go to github.com and under the setting (ssh and pgp key) add your public key.

