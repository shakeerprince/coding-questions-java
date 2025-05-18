const followBtn = document.getElementById('follow-btn');
const followStatus = document.getElementById('follow-status');

followBtn.addEventListener('click', () => {
    if (followBtn.textContent === 'Follow') {
        followBtn.textContent = 'Unfollow';
        followStatus.classList.remove('hidden');
    } else {
        followBtn.textContent = 'Follow';
        followStatus.classList.add('hidden');
    }
});