MinHeap minHeap = new MinHeap(15);
minHeap.insert(5);
minHeap.insert(45);
minHeap.insert(83);
minHeap.insert(23);
minHeap.insert(34);
minHeap.insert(71);
minHeap.insert(36);
minHeap.insert(10);
minHeap.insert(13);
out.println(minHeap.extractMin()); // 5
out.println(minHeap.extractMin()); // 10
minHeap.insert(4);
out.println(minHeap.extractMin()); // 4
out.println(minHeap.extractMin()); // 13
