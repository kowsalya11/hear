public T get(int index){
	return findNodeAtIndex(index).value;
}

private Node findNodeAtIndex(int index){
	if(index < 0 || index >= size()){
		throw new IllegalArgumentException(index + " is not valid index.");
	}
	Node current = root;
	//the the number of smaller elements of the current node as we traverse the tree..
	int totalSmallerElements = (current.leftChild == null) ? 0 : current.leftChild.sizeOfSubTree();
	while(current!= null){  //should always break, due to constraint above..
		if(totalSmallerElements == index){
			break;
		}
		if(totalSmallerElements > index){ //go left..
			current = current.leftChild;
			totalSmallerElements--;
			totalSmallerElements -= (current.rightChild == null) ? 0 : current.rightChild.sizeOfSubTree();
		} else { //go right..
			totalSmallerElements++;
			current = current.rightChild;
			totalSmallerElements += (current.leftChild == null) ? 0 : current.leftChild.sizeOfSubTree();
		}
	}
	return current;
}