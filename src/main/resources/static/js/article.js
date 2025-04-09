const deleteButton = document.getElementById("delete-btn");

if (deleteButton) {
    deleteButton.addEventListener('click', ev => {
        // article-id
        let id = document.getElementById("article-id").value;
        console.log('id: ' + id);
        fetch(`/api/articles/${id}`, {
            method: 'DELETE'
        }).then(() => {
            alert("삭제가 완료되었습니다.");
            location.replace('/articles');
        })
    })
}