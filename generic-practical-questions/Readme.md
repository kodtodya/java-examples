# General Coding Examples

## Data Structures
### Queue
- Queue Implementation using Stack (Costly EnQueue operation)
```
EnQueue Operation: till baseQueue is empty, push everything to tempQueue
                   then push new item to baseQueue                   
                   then push all items back to baseQueue

DeQueue Operation: Just pop the baseQueue
```

- Queue Implementation using Stack (Costly DeQueue operation)
```
EnQueue Operation: Just push the item in baseQueue

DeQueue Operation: till the baseQueue is empty, push everything to tempQueue
                    and then return tempStack.isEmpty() ? "" : tempStack.pop();
```

### Stack
- Stack Implementation using Queue (Costly Pop operation)
```
Push Opearation: Just push to baseQueue

Pop Operation: baseQueue.isEmpty() -> return;
               then till baseQueue is empty, push everything to tempQueue
               then while (baseQueue.size() != 1) {
                    tempQueue.add(baseQueue.peek());
                    baseQueue.remove();
                }
                
               then baseQueue.remove();
               
               then exchange the data
               Queue<String> exchangeQ = tempQueue;
               tempQueue = baseQueue;
               baseQueue = exchangeQ;
```
- Stack Implementation using Queue (Costly Push operation)
```
Push Operation: push new item to baseQueue
                then, till baseQueue is empty, push everything to tempQueue
                
                then, while (!baseQueue.isEmpty()) {
                    tempQueue.add(baseQueue.poll());
                 }
                 
                then, exchange the data
                Queue<String> exchangeQ = baseQueue;
                baseQueue = tempQueue;
                tempQueue = exchangeQ;
                
Pop Operation: If baseQueue is not empty -> then pop it
```
- Stack Implementation using Queue (Single List)
```
Push Operation: Calculate size of received list
                then, push new item to baseQueue
                
                then, till baseQueue is empty, push everything to tempQueue
                then, for (int counter = 0 ; counter < size; counter ++) {
                        baseQueue.add(baseQueue.remove());
                      }
                
Pop Operation: If baseQueue is not empty -> then pop it
```

## Sorting
- Bubble Sort
```
int length = integerList.size();
        Integer[]  finalList = integerList.toArray(new Integer[length]);

        for (int counter = 0; counter < length; counter++) {

            for (int nextCounter = 1; nextCounter < length-counter; nextCounter++) {
                if (finalList[nextCounter-1] > finalList[nextCounter]) {
                    int temp = finalList[nextCounter-1];
                    finalList[nextCounter-1] = finalList[nextCounter];
                    finalList[nextCounter] = temp;
                }
            }
        }
        return Arrays.asList(finalList);
```
- Sort without library - Find Second Highest no from list
```
int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;

        for (Integer item : integers) {
            if (item > highest) {
                secondHighest = highest;
                highest = item;
            }
        }
        return secondHighest;
```