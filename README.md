Qixweb: a lightweight java web framework
======

qixweb is a simple, easy, lightweight framework for building webapps by means of Application Controllers

qixweb was born by refactoring a few XP projects from the ground up. 

Its essential elements are:

1 an abstraction of node, each representing a page in a browser; each node is attached to some piece of the domain, but the domain is kept separated and clean ==> nodes may be connected directly to each other or via commands, which constitutes an abstraction of navigation of the entire webapp
2 an abstraction of command as action that will change the domain, producing a new node ==> ie: these commands may be used to wrap easily Prevayler commands
3 an abstraction of browser, url and link that keep nodes & commands well separated in turn from servlets and container aspects ==> it is therefore possible to test all the dynamic navigation logic server side without working with html, http or containers
4 an abstraction of response handler and renderer that enables browser to use template engines like Velocity on one side and that opens the world of multichannel applications on the other side
