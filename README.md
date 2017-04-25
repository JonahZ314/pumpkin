# pumpkin
## Marcus Ng, Allan Wang, Joanna Zhou

### Our Design

#### HelpDesk
The HelpDesk asks the user for his or her name, vip level, and problem. Our HelpDesk uses this information to create a ticket for the user and enqueues the ticket into the priority queue. The HelpDesk returns potential solutions based on keywords in the user's problem description (more info in ticket). If the user's problem is fixed, then his or her ticket is dequeued. If the user's problem is not fixed, then his or her ticket stays in the queue until a representative is available to help them and fix their problem. The HelpDesk includes only one method along with an ArrayPriorityQueue of Tickets -
* giveSolution - Parses through collected keywords and returns a set of solutions for each keyword.
* Tickets - An ArrayPriorityQueue of type Ticket.

#### Ticket
Implements the Comparable interface so it could work with any Comparable object. It includes the following instance variables -

* vipLevel - Keeps our queue orderly. User is asked to provide their vipLevel, and we'll place them in the queue based on it. The lower the number, the higher the priority with 0 being highest priority.

* keywords - A collection of possible problem keywords(i.e. internet, turn, slow, printer) that we acquire by parsing through the user's input.

* description - A description of the user's problem, as acquired by reader input.

* name - The user's name.

* resolved - A boolean that represents the problem status of the ticket. If solved, the ticket can be removed from the queue.

* ID - A number that shows the order the tickets were added to the queue. First ticket has ID of 0, second ticket has ID of 1, and so on.

### Embellishments

We categorize potential problems into four different categories each with a single keyword representing it(internet, turn, slow, printer), and our HelpDesk will suggest a set of different solutions for each category. In addition, if a solution works, the ticket will be removed from the queue. If not, the ticket remains on the queue. 
