# posting-list-with-hashing
Creating a posting list with hashing

We are interested in a program which receives a word as input and prints the name of the documents in the whole file set which include that word. The file set includes several text files as documents with a unique name. Each file has several words or a paragraph. You must create your own files and file set.
The goal is to find and print the name of documents including a given word in a constant time using hashing techniques.
For implementation, all files and words should be read by your program at first to create a hash table array. Each element in the array stores a linked list that corresponds to a word. The nodes of the lists represent the files which include that word. Lists nodes may/may not be sorted.
Once the program receives an input word, it generates its key index using a hashing function and then jumps to that index in the array and prints the content of all nodes of that linked list.
In order to avoid collision, you may use a long array. For conflict resolution, use open address linear or quadratic probing.
You may assume that there are only 10 files (1.txt, 2.txt, …, 10.txt). Each file includes a paragraph, in which, words have been separated by space.
