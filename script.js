function castVote() {
    let candidateName = prompt("Enter the candidate name:");
    if (candidateName) {
        // Send the candidateName to your backend for processing
        document.getElementById('output').innerText = `Your vote for ${candidateName} has been recorded.`;
    }
}

function viewResults() {
    // Fetch voting results from your backend and display
    document.getElementById('output').innerText = 'Voting Results:\nCandidate 1: 50 votes\nCandidate 2: 30 votes\nCandidate 3: 20 votes';
}

function exitVoting() {
    if (confirm("Are you sure you want to exit?")) {
        document.getElementById('output').innerText = 'Thank you for using the Online Voting Machine. Exiting...';
        // Add code to close the window or perform other exit actions
    }
}
