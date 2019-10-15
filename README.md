# FieldReadyTests

The project is based the [Defect4j](https://github.com/rjust/defects4j) benchmark. 
To use *FieldReadyTests* you MUST clone Defect4j first.

In order to run the tests:

* Clone the present repository.
* Copy the code of the corresponding to a given project on the folder where the same project inside Defect4J.
* Run the project by Usage<Project_Name_Version_Number>.java.

## Example

After installing [Defect4j](https://github.com/rjust/defects4j) you can checkout a version corresponding to a given bug using the following instruction (see [Defect4j](https://github.com/rjust/defects4j)'s repository for further details). 

For example with the following command:
```
defects4j checkout -p Lang -v 1b -w /tmp/lang_1_buggy
```
it is possible to checkout (in the ```/tmp/lang_1_buggy``` folder) a buggy source code (bug 1) version of the commons lang system.

In order to run the Field-Ready tests we need to copy the content of the folder:

```
FieldReadyTests/fieldTestingLang/1b/
```

In the corresponding path of the checked out project.

In the folder:

```
FieldReadyTests/fieldTestingLang/1b/use/usage/
```
we can find the class:

```
UsageJFree2.java
```

used to run the Field-Ready test.

